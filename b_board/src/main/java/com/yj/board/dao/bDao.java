package com.yj.board.dao;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.yj.board.dto.FurnitureDto;
import com.yj.board.dto.MeasureDto;
import com.yj.board.dto.bDto;

@Repository("BDAO")
public class bDao implements IDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<bDto> list() {
		
		IDao Idao = sqlSession.getMapper(IDao.class);
		
		System.out.println("�׽�Ʈ��");
		
		return Idao.list();
	}

	@Override
	public ArrayList<FurnitureDto> furniturelist() {
		// TODO Auto-generated method stub
		IDao Idao = sqlSession.getMapper(IDao.class);
		
		System.out.println("furniturelist �׽�Ʈ");
		return Idao.furniturelist();
	}
	
	@Override
	public ArrayList<FurnitureDto> checkFurnitureList(String[] kinds) {
		// TODO Auto-generated method stub

		IDao Idao = sqlSession.getMapper(IDao.class);
		
		System.out.println("checkFurnitureList �׽�Ʈ");
		return Idao.checkFurnitureList(kinds);
	}	
	
	@Override
	public ArrayList<MeasureDto> measurelist(String member_id) {
		// TODO Auto-generated method stub
		IDao Idao = sqlSession.getMapper(IDao.class);
		
		System.out.println("measurelist �׽�Ʈ");
		return Idao.measurelist(member_id);
	}
	
}
