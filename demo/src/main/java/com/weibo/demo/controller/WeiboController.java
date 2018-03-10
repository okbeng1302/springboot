package com.weibo.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.demo.pojo.Winfo;
import com.weibo.demo.service.WeiboService;



@RestController
@RequestMapping(value="/api")
public class WeiboController {

	@Resource
	WeiboService weiboService;
	
	
	@RequestMapping(value="/weibo/lastest",method=RequestMethod.GET)
	public List<Winfo> getWeiboData(){
		
		List<Winfo> winfoList = weiboService.getLastestInfo();
		return winfoList;
	}
}
