package com.lihaopeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lihaopeng.beans.Heros;
import com.lihaopeng.service.HerosService;

@Controller
public class MyController {
	
	@Resource
	private HerosService hService;
	
	//查询所有记录、条件查询
	@RequestMapping("list")
	public String selectHerosAll(Model model,
			@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "") Integer cid,
			@RequestParam(defaultValue = "") Integer isHave,
			@RequestParam(defaultValue = "") Double min,
			@RequestParam(defaultValue = "") Double max){
		//创建map集合
		Map<String,Object> map = new HashMap<>();
		//添加数据
		map.put("cid", cid);
		map.put("isHave", isHave);
		map.put("min", min);
		map.put("max", max);
		
		//查询所有记录、条件查询
		List<Heros> hlist = hService.queryHerosAll(map);
		
		//开始分页
		int pageSize = 3;//每页显示条数
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Heros> plist = new PageInfo<Heros>(hlist);
		
		//存储数据
		model.addAttribute("plist", plist);
		//页面分发
		return "list";
	}
	
	
}
