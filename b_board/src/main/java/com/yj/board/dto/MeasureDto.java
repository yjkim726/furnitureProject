package com.yj.board.dto;

public class MeasureDto {
	
	int measure_id;
	String measure_name;
	String heights;
	String horizontal;
	String vertical;
	String color;
	String kinds;
	String member_id;
	
	
	public int getMeasure_id() {
		return measure_id;
	}
	public void setMeasure_id(int measure_id) {
		this.measure_id = measure_id;
	}
	

	public String getMeasure_name() {
		return measure_name;
	}
	public void setMeasure_name(String measure_name) {
		this.measure_name = measure_name;
	}
	public String getHeights() {
		return heights;
	}
	public void setHeights(String heights) {
		this.heights = heights;
	}
	
	public String getHorizontal() {
		return horizontal;
	}
	public void setHorizontal(String horizontal) {
		this.horizontal = horizontal;
	}
	
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	

}
