package com.lym.ssm.controller;

import com.lym.ssm.domain.Admin;
import com.lym.ssm.mapper.AdminMapper;
import com.lym.ssm.util.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by dllo on 17/12/2.
 */
@Controller
public class UnixController {

    @Resource
    private AdminMapper adminMapper;


    @RequestMapping("/loginAdmin")
    public String loginAdmin(Admin admin){
        List<Admin> admins = adminMapper.findAll(admin);
        admins.forEach(System.out::println);
        if (admins.size() > 0){
            return "index";
        }else {
            return "error";
        }
    }

//    @RequestMapping("/user/check.jpg")
//    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // 通知浏览器不要缓存
//        response.setHeader("Expires", "-1");
//        response.setHeader("Cache-Control", "no-cache");
//        response.setHeader("Pragma", "-1");
//        CaptchaUtil util = CaptchaUtil.Instance();
//        // 将验证码输入到session中，用来验证
//        String code = util.getString();
//        request.getSession().setAttribute("code", code);
//        // 输出打web页面
//        ImageIO.write(util.getImage(), "jpg", response.getOutputStream());
//    }

}
