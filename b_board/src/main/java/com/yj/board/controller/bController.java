package com.yj.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yj.board.service.bService;

@Controller
public class bController {

	@Resource(name="yjService")
	private bService bsvc;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		bsvc.list(model);
		
		return "list";
	}
	
	@RequestMapping("main")
	public String mian(Model model) {	
		return "main";
	}
	
	//가구 목록 뿌리기
	@RequestMapping("furniture")
	public String flist(Model model) {
		bsvc.furniturelist(model);
		return "flist";
	}
	
	//가구 목록 checkout
	@RequestMapping("check_flist")
	public String check_flist(HttpServletRequest request, Model model) {
		
		System.out.println("bController");
		bsvc.check_flist(request,model);
		
		return "checkList";
		//return "checkList";
	}
	
	@RequestMapping("measure")
	public String measureList(Model model) {
		model.addAttribute("member_id", "fokodev");
		bsvc.measurelist(model);
		return "mlist"; 
	}
	
	@RequestMapping("delete")
	public String delete() {
		return "delete";
	}

	
}
