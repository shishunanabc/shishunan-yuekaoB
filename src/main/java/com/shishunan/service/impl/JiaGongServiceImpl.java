package com.shishunan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shishunan.dao.JiaGongDao;
import com.shishunan.entity.Contain;
import com.shishunan.entity.JiaGong;
import com.shishunan.service.JiaGongService;
@Service
public class JiaGongServiceImpl implements JiaGongService{
	
	@Autowired
	private JiaGongDao dao;

	public List<JiaGong> list(Contain contain) {
		// TODO Auto-generated method stub
		return dao.list(contain);
	}

	public void add(JiaGong jiaGong) {
		dao.add(jiaGong);
	}
}
