package com.shishunan.entity;

public class Contain {
	private Integer jid;//联络单号
	private Integer zhizaoId;//制造部编号
	private String zhizaobu;//制造部
	private Integer sheId;//设备部编号
	private String shebu;//设备部
	private String danwei;//加工单位
	private String lianperson;// 联系人
	private String shouperson;// 收货确认人
	private String peiperson;//验收确认人
	private String caiperson;//采购报销人
	private String biezhu;//备注
	private String b1;
	private String b2;//报送日期范围
	public Contain() {
		super();
	}
	public Contain(Integer jid, Integer zhizaoId, String zhizaobu, Integer sheId, String shebu, String danwei,
			String lianperson, String shouperson, String peiperson, String caiperson, String biezhu, String b1,
			String b2) {
		super();
		this.jid = jid;
		this.zhizaoId = zhizaoId;
		this.zhizaobu = zhizaobu;
		this.sheId = sheId;
		this.shebu = shebu;
		this.danwei = danwei;
		this.lianperson = lianperson;
		this.shouperson = shouperson;
		this.peiperson = peiperson;
		this.caiperson = caiperson;
		this.biezhu = biezhu;
		this.b1 = b1;
		this.b2 = b2;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public Integer getZhizaoId() {
		return zhizaoId;
	}
	public void setZhizaoId(Integer zhizaoId) {
		this.zhizaoId = zhizaoId;
	}
	public String getZhizaobu() {
		return zhizaobu;
	}
	public void setZhizaobu(String zhizaobu) {
		this.zhizaobu = zhizaobu;
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
	public String getDanwei() {
		return danwei;
	}
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	public String getLianperson() {
		return lianperson;
	}
	public void setLianperson(String lianperson) {
		this.lianperson = lianperson;
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
	public String getCaiperson() {
		return caiperson;
	}
	public void setCaiperson(String caiperson) {
		this.caiperson = caiperson;
	}
	public String getBiezhu() {
		return biezhu;
	}
	public void setBiezhu(String biezhu) {
		this.biezhu = biezhu;
	}
	public String getB1() {
		return b1;
	}
	public void setB1(String b1) {
		this.b1 = b1;
	}
	public String getB2() {
		return b2;
	}
	public void setB2(String b2) {
		this.b2 = b2;
	}
	@Override
	public String toString() {
		return "Contain [jid=" + jid + ", zhizaoId=" + zhizaoId + ", zhizaobu=" + zhizaobu + ", sheId=" + sheId
				+ ", shebu=" + shebu + ", danwei=" + danwei + ", lianperson=" + lianperson + ", shouperson="
				+ shouperson + ", peiperson=" + peiperson + ", caiperson=" + caiperson + ", biezhu=" + biezhu + ", b1="
				+ b1 + ", b2=" + b2 + "]";
	}
	
}
