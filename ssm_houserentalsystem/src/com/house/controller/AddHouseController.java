// 
// 
// 

package com.house.controller;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.house.entity.House;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Iterator;
import java.io.File;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IHouserService;
import org.springframework.stereotype.Controller;

@Controller
public class AddHouseController
{
    private String dirPath;
    private String simplePath;
    private StringBuilder detailsPath;
    @Autowired
    private IHouserService service;
    
    public AddHouseController() {
        this.dirPath = String.valueOf(Thread.currentThread().getContextClassLoader().getResource("").getPath().substring(0, Thread.currentThread().getContextClassLoader().getResource("").getPath().length() - 16)) + "/file/";
        this.simplePath = "";
        this.detailsPath = new StringBuilder();
    }
    
    @RequestMapping({ "/MultipleUpload" })
    @ResponseBody
    public Map<String, Object> upload(@RequestParam("file") final List<MultipartFile> file, final HttpServletRequest req) {
        final Map<String, Object> map = new HashMap<String, Object>();
        if (!file.isEmpty() && file.size() > 0) {
            for (final MultipartFile f : file) {
                try {
                    final String filename = UUID.randomUUID() + f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."));
                    final String localPath = String.valueOf(req.getServletContext().getContextPath()) + "/file/" + filename;
                    this.detailsPath.append(String.valueOf(localPath) + "~");
                    final File filePath = new File(this.dirPath);
                    if (!filePath.exists()) {
                        filePath.mkdirs();
                    }
                    f.transferTo(new File(String.valueOf(this.dirPath) + filename));
                }
                catch (Exception e) {
                    map.put("code", 1);
                    map.put("msg", "\u4e0a\u4f20\u5931\u8d25");
                    e.printStackTrace();
                }
            }
            map.put("code", 0);
            map.put("msg", "\u4e0a\u4f20\u6210\u529f");
        }
        return map;
    }
    
    @RequestMapping({ "/singleUpload" })
    @ResponseBody
    public Map<String, Object> singleUpload(@RequestParam("file") final MultipartFile file, final HttpServletRequest req, final HttpSession session) {
        final Map<String, Object> map = new HashMap<String, Object>();
        try {
            final String suffixName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            final String filename = UUID.randomUUID() + suffixName;
            final File filePath = new File(this.dirPath);
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            map.put("image", this.simplePath = String.valueOf(req.getServletContext().getContextPath()) + "/file/" + filename);
            file.transferTo(new File(String.valueOf(this.dirPath) + filename));
            map.put("code", 0);
            map.put("msg", "\u4e0a\u4f20\u6210\u529f");
        }
        catch (Exception e) {
            map.put("code", 1);
            map.put("msg", "\u4e0a\u4f20\u5931\u8d25");
            e.printStackTrace();
        }
        return map;
    }
    
    @RequestMapping({ "/addHouse" })
    public String addHouse() {
        return "addhouse.jsp";
    }
    
    @RequestMapping({ "/addHouseRecord" })
    @ResponseBody
    public String addHouse(final House house) {
        if (house.getPublisher() == null || "".equals(house.getPublisher())) {
            house.setPublisher("\u7ba1\u7406\u5458");
        }
        house.setHouseImage(this.simplePath);
        house.setHouseDetailsImg(this.detailsPath.toString());
        final int n = this.service.addNewHouse(house);
        if (n > 0) {
            this.detailsPath.delete(0, this.detailsPath.length());
            return "OK";
        }
        return "FAIL";
    }
}
