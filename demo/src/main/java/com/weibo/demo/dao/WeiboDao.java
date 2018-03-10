package com.weibo.demo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.weibo.demo.pojo.Winfo;




public interface WeiboDao {

	/*
	 * 获取最新的微博信息
	 */
	public List<Winfo> getLastestInfo();
	
}
