 package com.yj.board.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface bService {

	public void list(Model model);
	
	public void furniturelist(Model model);
	
	public void check_flist(HttpServletRequest request, Model model);
	
	public void measurelist(Model model);
}
