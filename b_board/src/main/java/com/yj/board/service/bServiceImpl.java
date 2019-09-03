package com.yj.board.service;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.yj.board.dao.bDao;
import com.yj.board.dto.FurnitureDto;
import com.yj.board.dto.MeasureDto;
import com.yj.board.dto.bDto;

@Service("yjService")
public class bServiceImpl implements bService {

	@Resource(name="BDAO")
	private bDao dao;
	
	
	@Override
	public void list(Model model) {
		// TODO Auto-generated method stub
		ArrayList<bDto> dtoArr= dao.list();
		System.out.println("list");
		for(bDto dto : dtoArr) {
			System.out.println(dto.getbId()+" "+dto.getbName()+" "+dto.getbIndent());
		}
	}
	
	@Override
	public void furniturelist(Model model) {
		// TODO Auto-generated method stub
		ArrayList<FurnitureDto> dtoArr= dao.furniturelist();
		System.out.println("furniturelist");
		for(FurnitureDto dto : dtoArr) {
			System.out.println(dto.getFnt_id()+" "+dto.getFnt_name()+" "+dto.getKinds()+" "+dto.getImage_path());
		}
		
		model.addAttribute("Dto", dtoArr);
	}

	@Override
	public void check_flist(HttpServletRequest request, Model model) {
		// TODO Auto-generated method stub
		
		System.out.println(request.getParameterValues("furniture"));
		ArrayList<FurnitureDto> dtoArr= dao.checkFurnitureList(request.getParameterValues("furniture"));
		
		for(FurnitureDto dto : dtoArr) {
			System.out.println(dto.getFnt_id()+" "+dto.getFnt_name()+" "+dto.getKinds()+" "+dto.getImage_path());
		}
		
		model.addAttribute("Dto", dtoArr);
	}
	
	@Override
	public void measurelist(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> m = model.asMap();
		String member_id = (String) m.get("member_id");
		System.out.println("member_Id"+member_id);
		ArrayList<MeasureDto> dtoArr= dao.measurelist(member_id);
		System.out.println("measurelist");
		for(MeasureDto dto : dtoArr) {
			System.out.println(dto.getMember_id()+" "+dto.getMeasure_name()+" "+dto.getKinds()+" "+dto.getHorizontal()+" "+dto.getVertical());
		}
		
		model.addAttribute("Dto", dtoArr);
	}
	
}
