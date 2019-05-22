package com.practice.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class FileUpload {
    @RequestMapping("uploadFile")
    public String upload(MultipartFile myFile, HttpServletRequest request) throws IOException {
        // 获取文件的名称
        String filename = myFile.getOriginalFilename();
        // 生成唯一的名称
        filename = UUID.randomUUID().toString() + filename;
        // 保存位置
        // 获取当前项目的路径
        String basePath = request.getServletContext().getRealPath("/uploads");
        System.out.println(basePath);
        // 生成当天的目录
        String datePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        // 创建保存文件的目录
        File file = new File(basePath + "/" + datePath);
        // 判断目录是否存在,若不存在则创建
        if (!file.exists()) {
            file.mkdirs();
        }
        // 读取上传文件的流数组,并写入指定的文件
        myFile.transferTo(new File(file + "/" + filename));
        return "success";
    }

    @RequestMapping("test")
    public String test1(MultipartFile myFile, HttpServletRequest request) throws IOException {
        String filename = myFile.getOriginalFilename();

        filename = UUID.randomUUID().toString() + filename;

        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        File file = new File("D:\\作业" + "/" + time);

        if (!file.exists()) {
            file.mkdirs();
        }

        myFile.transferTo(new File(file + "/" + filename));
        return "success";
    }

    @RequestMapping("test2")
    public String test2(MultipartFile myFile, HttpServletRequest request) throws IOException {
        String servicePath = "http://localhost:8090/day02_fileupload/uploads/";

        // 获取文件的名
        String filename = myFile.getOriginalFilename();
        // 生成唯一的名称
        filename = UUID.randomUUID().toString() + filename;

        // 创建连接
        Client client = Client.create();
        // 创建网络资源(向文件服务器上创建一个空文件)
        WebResource resource = client.resource(servicePath + filename);
        // 将上传文件数组,写入到文件服务器上的文件中
        resource.put(myFile.getBytes());
        //

        return "success";
    }
}
