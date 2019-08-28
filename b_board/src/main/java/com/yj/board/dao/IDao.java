package com.yj.board.dao;

import java.util.ArrayList;

import com.yj.board.dto.FurnitureDto;
import com.yj.board.dto.bDto;

public interface IDao {

	public ArrayList<bDto> list();
	
	public ArrayList<FurnitureDto> furniturelist();
}
