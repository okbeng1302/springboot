package com.weibo.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.mongodb.morphia.aggregation.Sort;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Service;

import com.weibo.demo.controller.MorphiaFactory;
import com.weibo.demo.dao.WeiboDao;
import com.weibo.demo.pojo.Winfo;


@Service
public class WeiboService implements WeiboDao {

	@Resource
	MorphiaFactory mf;

	public List<Winfo> getLastestInfo() {

		Query<Winfo> datebase = mf.get().createQuery(Winfo.class);

		List<Winfo> list = new ArrayList<Winfo>();
		Query<Winfo> datas = datebase.order("-create_time").limit(10);
		for (Winfo item : datas) {
			list.add(item);
		}
		return list;
	}

}
