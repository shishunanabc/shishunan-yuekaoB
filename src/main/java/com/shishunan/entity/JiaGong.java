package com.shishunan.entity;

import java.util.List;

public class JiaGong {
	private Integer jid;//联络单号
	private String bsdate;//报送时间
	private String zhizaobu;//制造部
	private Integer zhizaoId;//制造部编号
	private Integer peijianId;//配件编号
	private Double price;//参考单价
	private Integer num;//数量
	private Double money;//金额
	private String yaoqiu;//具体技术要求
	private Integer sheId;//设备部编号
	private String shebu;//设备部
	private String peijiandate;//配件外送时间
	private Double sprice;//审核单价
	private Double smoney;//审核金额
	private String faperson;//发货确认人
	private String danwei;//加工单位
	private Double jprice;//加工单位单价
	private String shdate;//配送送回时间
	private String caiperson;//采购部报销人
	private String img;//加工检验图片上传
	private String lianperson;//联系人
	private Double jine;//加工单位金额
	private String shouperson;//收货确认人
	private String peiperson;//采购部报销人
	private String biezhu;//备注
	private Integer pid;//外键
	private List<Parts> parts;
	public JiaGong() {
		super();
	}
	public JiaGong(Integer jid, String bsdate, String zhizaobu, Integer zhizaoId, Integer peijianId, Double price,
			Integer num, Double money, String yaoqiu, Integer sheId, String shebu, String peijiandate, Double sprice,
			Double smoney, String faperson, String danwei, Double jprice, String shdate, String caiperson, String img,
			String lianperson, Double jine, String shouperson, String peiperson, String biezhu, Integer pid,
			List<Parts> parts) {
		super();
		this.jid = jid;
		this.bsdate = bsdate;
		this.zhizaobu = zhizaobu;
		this.zhizaoId = zhizaoId;
		this.peijianId = peijianId;
		this.price = price;
		this.num = num;
		this.money = money;
		this.yaoqiu = yaoqiu;
		this.sheId = sheId;
		this.shebu = shebu;
		this.peijiandate = peijiandate;
		this.sprice = sprice;
		this.smoney = smoney;
		this.faperson = faperson;
		this.danwei = danwei;
		this.jprice = jprice;
		this.shdate = shdate;
		this.caiperson = caiperson;
		this.img = img;
		this.lianperson = lianperson;
		this.jine = jine;
		this.shouperson = shouperson;
		this.peiperson = peiperson;
		this.biezhu = biezhu;
		this.pid = pid;
		this.parts = parts;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getBsdate() {
		return bsdate;
	}
	public void setBsdate(String bsdate) {
		this.bsdate = bsdate;
	}
	public String getZhizaobu() {
		return zhizaobu;
	}
	public void setZhizaobu(String zhizaobu) {
		this.zhizaobu = zhizaobu;
	}
	public Integer getZhizaoId() {
		return zhizaoId;
	}
	public void setZhizaoId(Integer zhizaoId) {
		this.zhizaoId = zhizaoId;
	}
	public Integer getPeijianId() {
		return peijianId;
	}
	public void setPeijianId(Integer peijianId) {
		this.peijianId = peijianId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getYaoqiu() {
		return yaoqiu;
	}
	public void setYaoqiu(String yaoqiu) {
		this.yaoqiu = yaoqiu;
	}
	public Integer getSheId() {
		return sheId;
	}
	public void setSheId(Integer sheId) {
		this.sheId = sheId;
	}
	public String getShebu() {
		return shebu;
	}
	public void setShebu(String shebu) {
		this.shebu = shebu;
	}
	public String getPeijiandate() {
		return peijiandate;
	}
	public void setPeijiandate(String peijiandate) {
		this.peijiandate = peijiandate;
	}
	public Double getSprice() {
		return sprice;
	}
	public void setSprice(Double sprice) {
		this.sprice = sprice;
	}
	public Double getSmoney() {
		return smoney;
	}
	public void setSmoney(Double smoney) {
		this.smoney = smoney;
	}
	public String getFaperson() {
		return faperson;
	}
	public void setFaperson(String faperson) {
		this.faperson = faperson;
	}
	public String getDanwei() {
		return danwei;
	}
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	public Double getJprice() {
		return jprice;
	}
	public void setJprice(Double jprice) {
		this.jprice = jprice;
	}
	public String getShdate() {
		return shdate;
	}
	public void setShdate(String shdate) {
		this.shdate = shdate;
	}
	public String getCaiperson() {
		return caiperson;
	}
	public void setCaiperson(String caiperson) {
		this.caiperson = caiperson;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getLianperson() {
		return lianperson;
	}
	public void setLianperson(String lianperson) {
		this.lianperson = lianperson;
	}
	public Double getJine() {
		return jine;
	}
	public void setJine(Double jine) {
		this.jine = jine;
	}
	public String getShouperson() {
		return shouperson;
	}
	public void setShouperson(String shouperson) {
		this.shouperson = shouperson;
	}
	public String getPeiperson() {
		return peiperson;
	}
	public void setPeiperson(String peiperson) {
		this.peiperson = peiperson;
	}
	public String getBiezhu() {
		return biezhu;
	}
	public void setBiezhu(String biezhu) {
		this.biezhu = biezhu;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public List<Parts> getParts() {
		return parts;
	}
	public void setParts(List<Parts> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "JiaGong [jid=" + jid + ", bsdate=" + bsdate + ", zhizaobu=" + zhizaobu + ", zhizaoId=" + zhizaoId
				+ ", peijianId=" + peijianId + ", price=" + price + ", num=" + num + ", money=" + money + ", yaoqiu="
				+ yaoqiu + ", sheId=" + sheId + ", shebu=" + shebu + ", peijiandate=" + peijiandate + ", sprice="
				+ sprice + ", smoney=" + smoney + ", faperson=" + faperson + ", danwei=" + danwei + ", jprice=" + jprice
				+ ", shdate=" + shdate + ", caiperson=" + caiperson + ", img=" + img + ", lianperson=" + lianperson
				+ ", jine=" + jine + ", shouperson=" + shouperson + ", peiperson=" + peiperson + ", biezhu=" + biezhu
				+ ", pid=" + pid + ", parts=" + parts + "]";
	}
	
}
