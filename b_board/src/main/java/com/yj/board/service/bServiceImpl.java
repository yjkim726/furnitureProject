package com.yj.board.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.yj.board.dao.bDao;
import com.yj.board.dto.FurnitureDto;
import com.yj.board.dto.bDto;

@Service("yjService")
public class bServiceImpl implements bService {

	@Resource(name="BDAO")
	private bDao dao;
	
	
	@Override
	public void list(Model model) {
		// TODO Auto-generated method stub
		ArrayList<bDto> dtoArr= dao.list();
		System.out.println("bServiceImpl");
		for(bDto dto : dtoArr) {
			System.out.println(dto.getbId()+" "+dto.getbName()+" "+dto.getbIndent());
		}
	}
	
	@Override
	public void furniturelist(Model model) {
		// TODO Auto-generated method stub
		ArrayList<FurnitureDto> dtoArr= dao.furniturelist();
		System.out.println("bServiceImpl");
		for(FurnitureDto dto : dtoArr) {
			System.out.println(dto.getFnt_id()+" "+dto.getFnt_name()+" "+dto.getKinds());
		}
		
		model.addAttribute("Dto", dtoArr);
	}
	
}
