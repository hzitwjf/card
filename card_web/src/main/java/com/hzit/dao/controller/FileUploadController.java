package com.hzit.dao.controller;


import com.hzit.dao.services.FileUploadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wjf13 on 2016/10/30.
 */
@Controller
public class FileUploadController {
    @Autowired
    private FileUploadServices fileUploadServices;
    @RequestMapping("pushOneFile")
    public String pushMoreFile(){
        return "index";
    }
    @RequestMapping("/hand/upload")
    @ResponseBody
    public String HandUpload(@RequestParam("file")MultipartFile file, HttpServletRequest httpServletRequest){
        return fileUploadServices.handleUploadInfo(file,httpServletRequest);
    }

}
