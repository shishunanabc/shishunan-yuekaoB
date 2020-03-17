package com.shishunan.service;

import java.util.List;

import com.shishunan.entity.Contain;
import com.shishunan.entity.JiaGong;

public interface JiaGongService {

	List<JiaGong> list(Contain contain);

	void add(JiaGong jiaGong);

}
