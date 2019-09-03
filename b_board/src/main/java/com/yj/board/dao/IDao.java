package com.yj.board.dao;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.yj.board.dto.FurnitureDto;
import com.yj.board.dto.MeasureDto;
import com.yj.board.dto.bDto;

public interface IDao {

	public ArrayList<bDto> list();
	
	public ArrayList<FurnitureDto> furniturelist();

	public ArrayList<FurnitureDto> checkFurnitureList(String[] kinds);
	
	public ArrayList<MeasureDto> measurelist(String member_id);
}
