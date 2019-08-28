package com.yj.board.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.board.dto.FurnitureDto;
import com.yj.board.dto.bDto;

@Repository("BDAO")
public class bDao implements IDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<bDto> list() {
		
		IDao Idao = sqlSession.getMapper(IDao.class);
		
		System.out.println("테스트중");
		
		return Idao.list();
	}

	@Override
	public ArrayList<FurnitureDto> furniturelist() {
		// TODO Auto-generated method stub
		IDao Idao = sqlSession.getMapper(IDao.class);
		
		System.out.println("furniturelist 테스트");
		return Idao.furniturelist();
	}
	
	
	
}
