package com.yifei.demo.controller;

import com.alibaba.druid.util.StringUtils;
import com.yifei.demo.domain.Aaa;
import com.yifei.demo.service.AaaService;
import com.yifei.demo.utils.core.ResultInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AaaController {
    @Resource
    private AaaService aaaService;

    /**
     * 添加模版
     */
    @RequestMapping("/aaa/addAaa")
    public Object addAaa(HttpServletRequest request, HttpServletResponse response) {
        ResultInfo resInfo = new ResultInfo();
        String aaaName = request.getParameter("aaaName");

        if (StringUtils.isEmpty("aaaName")) {
            resInfo.setCode(10000);
            resInfo.setMessage("模版名称不能为空");
            return resInfo;
        }

        int count;
        Aaa aaa = new Aaa();
        aaa.setAaName(aaaName);

        try {
            count = aaaService.addAaa(aaa);
        } catch (Exception e) {
            e.printStackTrace();
            resInfo.setCode(10001);
            resInfo.setMessage("添加模版异常");
            return resInfo;
        }
        if (count < 1) {
            resInfo.setCode(10001);
            resInfo.setMessage("添加模版失败");
            return resInfo;
        }
        resInfo.setMessage("添加模版成功");
        return resInfo;
    }

}
