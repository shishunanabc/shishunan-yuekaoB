package com.shishunan.dao;

import java.util.List;


import com.shishunan.entity.Contain;
import com.shishunan.entity.JiaGong;

public interface JiaGongDao {

	List<JiaGong> list(Contain contain);

	void add(JiaGong jiaGong);

}
