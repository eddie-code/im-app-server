package com.learn.controller;

import com.alibaba.fastjson.JSONObject;
import com.learn.common.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @description
 */
@Slf4j
@RestController
public class CallbackController {


    @RequestMapping("/callback")
    public ResponseVO callback(@RequestBody Object req, String command, Integer appId) {
        log.info("{}收到{}回调数据：{}", appId,command, JSONObject.toJSONString(req));
        return ResponseVO.successResponse();
    }
}
