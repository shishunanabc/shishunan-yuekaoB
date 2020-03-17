package com.shishunan.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shishunan.entity.Contain;
import com.shishunan.entity.JiaGong;
import com.shishunan.service.JiaGongService;

@Controller
public class JiaGongController {

	@Autowired
	private JiaGongService service;
	//页面展示
	@RequestMapping("list")
	public String list(Contain contain,Model m,@RequestParam(defaultValue = "1")int page) {
		PageHelper.startPage(page, 3);
		List<JiaGong> list=service.list(contain);
		PageInfo<JiaGong> pages=new PageInfo<JiaGong>(list);
		m.addAttribute("li", list);
		m.addAttribute("info", pages);
		m.addAttribute("con", contain);
		return "list";
	}
	//添加页面
	@RequestMapping("add")
	public String add(JiaGong jiaGong,@RequestParam("f")MockMultipartFile file) throws IllegalStateException, IOException {
		//判断
		if (file.getSize()>0) {
			//设置照片的存储路径
			String path="D:\\img";
			String filename=file.getOriginalFilename();
			File file2=new File(path,filename);
			file.transferTo(file2);
			jiaGong.setImg("/img/"+filename);
		}
		service.add(jiaGong);
		return "redirect:list";
	}
}
