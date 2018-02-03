package com.spring.cloud.server;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DbController {
	/*@Value("${driverClassName}")
	String driverClassName;
	@Value("${url}")
	String url;
	@Value("${username}")
	String username;
	@Value("${password}")
	String password;*/
	
	@Value("${msg}")
	String message;
	
	
	@RequestMapping(value="/db", method=RequestMethod.GET)
	public String getDbDetails(){
		Map<String, String> dbMap = new HashMap<>();
		dbMap.put("msg", message);
		/*dbMap.put("driverClassName", driverClassName);
		dbMap.put("username", username);
		dbMap.put("password", password);*/
		return dbMap.toString();
	}
}
