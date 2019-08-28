package com.yj.board.controller;

import javax.annotation.Resource;

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
	
	@RequestMapping("flist")
	public String flist(Model model) {
		
		bsvc.furniturelist(model);
		
		return "flist";
	}
	
	@RequestMapping("delete")
	public String delete() {
		return "delete";
	}

	
}
