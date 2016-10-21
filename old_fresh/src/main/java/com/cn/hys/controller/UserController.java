package com.cn.hys.controller;  
  
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.cn.hys.pojo.User;  
import com.cn.hys.service.IUserService;  
  
@Controller  
@RequestMapping("/user33333")  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser3333")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}