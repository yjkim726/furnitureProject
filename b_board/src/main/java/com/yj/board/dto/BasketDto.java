package com.yj.board.dto;

public class BasketDto {

	int basket_id;
	String member_id;
	String site;
	int fnt_id;
	
	public int getBasket_id() {
		return basket_id;
	}
	public void setBasket_id(int basket_id) {
		this.basket_id = basket_id;
	}
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	public int getFnt_id() {
		return fnt_id;
	}
	public void setFnt_id(int fnt_id) {
		this.fnt_id = fnt_id;
	}
	
	
}
