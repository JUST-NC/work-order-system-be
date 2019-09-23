package com.just.teachersystem.Controller;

import com.just.teachersystem.Service.CommonService;
import com.just.teachersystem.Utill.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/outline")
public class LoginController {
    @Autowired
    private CommonService service;
    @PostMapping("/login")
    public JsonData login(@RequestParam("worknum") String worknum, @RequestParam("password") String password){
        Map map=service.login(worknum,password);
        map.put("token","");
        return JsonData.buildSuccess(map);
    }
}
