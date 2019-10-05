package com.just.teachersystem;
import java.time.Year;
import java.util.Calendar;
import	java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import	java.util.Map;


import com.just.teachersystem.Service.FileService;
import com.just.teachersystem.Service.ServiceImp.FileServiceImp;
import com.just.teachersystem.Utill.HttpClientResult;
import com.just.teachersystem.Utill.HttpClientUtils;
import com.just.teachersystem.Utill.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeachersystemApplicationTests {

    @Autowired
    FileService fileService;
    @Test
    public void contextLoads() {

    }
    @Test
    public void Test1(){
        fileService.filePanLogin();
    }
    @Test
    public void Test2() throws Exception {
        String url ="http://test.iskye.cn/api/alien/fetch/upload/token";
        Map<String, String  >body=new HashMap<> ();
        body.put("filename", "name.jpg");
        body.put("expireTime", "2019-09-30 23:59:59");
        body.put("privacy", String.valueOf(false));
        body.put("size", String.valueOf(125645));
        body.put("dirPath", "/home/");
        String cookie="_ak=410dfa4a-63fd-4ec6-5eba-58f6ba4a381e; Path=/; Expires=Wed, 30 Oct 2019 02:01:46 GMT";
        Map<String, String> header = new HashMap<>();
        header.put("Cookie", cookie);
//
        System.out.println(HttpClientUtils.doPost(url, header, body));


    }


}
