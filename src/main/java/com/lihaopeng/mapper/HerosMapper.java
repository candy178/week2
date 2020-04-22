package com.lihaopeng.mapper;

import java.util.List;
import java.util.Map;

import com.lihaopeng.beans.Camp;
import com.lihaopeng.beans.Heros;

public interface HerosMapper {
	
	//查询所有英雄、模糊、条件查询
	public List<Heros> selectHerosAll(Map<String, Object> map);
	
	//查询所有阵容信息
	public List<Camp> selectCampAll();
	
	//查询单条记录信息
	public Heros selectHerosById(int id);
	
	//添加英雄表记录
	public int insertHeros(Heros heros);
	
	//购买英雄
	public int updateHeros(Heros heros);
}
