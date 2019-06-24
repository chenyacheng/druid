package com.chenyacheng.druid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/service")
    public String service() {
		// http://localhost:8080/service
        return "服务已启动";
    }

}
