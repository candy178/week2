package com.lihaopeng.service;

import java.util.List;
import java.util.Map;

import com.lihaopeng.beans.Camp;
import com.lihaopeng.beans.Heros;

public interface HerosService {

	//查询所有英雄、模糊、条件查询
	public List<Heros> queryHerosAll(Map<String, Object> map);
	
	//查询所有阵容信息
	public List<Camp> queryCampAll();
	
	//查询单条记录信息
	public Heros queryHerosById(int id);
	
	//添加英雄表记录
	public int addHeros(Heros heros);
	
	//购买英雄
	public int changeHeros(Heros heros);
}
