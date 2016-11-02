package com.hzit.dao.services;


import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wjf13 on 2016/10/30.
 */
public interface FileUploadServices {
    /**
     * 上传单个文件
     * @param multipartFile springBoot提供上传文件类
     * @param httpServletRequest  客户端发出的请求
     * @return  返回一个String类型的结果
     */
    String handleUploadInfo( MultipartFile multipartFile, HttpServletRequest httpServletRequest);
}
