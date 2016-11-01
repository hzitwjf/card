package com.hzit.dao.services;


import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wjf13 on 2016/10/30.
 */
public interface FileUploadServices {
    /**
     * 根据页面所发过来的图片信息进行增加图片
     * @param httpServletRequest  客户端浏览器发出的请求
     * @return  返回一个Object类型的数据！
     */
    Object handleUploadInfo(HttpServletRequest httpServletRequest);
}
