package com.lihaopeng.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lihaopeng.beans.Camp;
import com.lihaopeng.beans.Heros;
import com.lihaopeng.mapper.HerosMapper;

@Service
public class HerosServiceImpl implements HerosService {
	
	@Resource
	private HerosMapper hMapper;

	@Override
	public List<Heros> queryHerosAll(Map<String, Object> map) {
		return hMapper.selectHerosAll(map);
	}

	@Override
	public List<Camp> queryCampAll() {
		return hMapper.selectCampAll();
	}

	@Override
	public Heros queryHerosById(int id) {
		return hMapper.selectHerosById(id);
	}

	@Override
	public int addHeros(Heros heros) {
		return hMapper.insertHeros(heros);
	}

	@Override
	public int changeHeros(Heros heros) {
		return hMapper.updateHeros(heros);
	}
}
