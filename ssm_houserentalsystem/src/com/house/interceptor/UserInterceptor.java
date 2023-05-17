// 
// 
// 

package com.house.interceptor;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import com.house.entity.Admin;
import com.house.entity.Users;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;

public class UserInterceptor implements HandlerInterceptor
{
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        response.setCharacterEncoding("utf-8");
        final String url = request.getRequestURL().toString();
        if (url.indexOf("toIndexPage") >= 0 || url.indexOf("login") >= 0 || url.indexOf("regist") >= 0 || url.indexOf("toDetailsPage") >= 0 || url.indexOf("findHouseByLike") >= 0 || url.indexOf("findHousrOrderByAsc") >= 0 || url.indexOf("findHousrOrderByDesc") >= 0 || url.indexOf("toAdminLogin") >= 0 || url.indexOf("adminAccess") >= 0) {
            return true;
        }
        final HttpSession session = request.getSession();
        final Users u = (Users)session.getAttribute("loginUser");
        final Admin admin = (Admin)session.getAttribute("Admin");
        if (u != null || admin != null) {
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward((ServletRequest)request, (ServletResponse)response);
        return false;
    }
}
