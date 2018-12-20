package com.bit.board.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.board.admin.model.BoardListDto;
import com.bit.board.admin.service.BoardAdminService;

@Controller
@RequestMapping("/badmin")
public class boardAdminController {
	
	@Autowired
	private BoardAdminService boardAdminService;
	
	
	@RequestMapping("boardmenu.bit")
	public String boardMenu(Map<String, Object> model) {
		
		List<BoardListDto> list = boardAdminService.getBoardMenu();//모델
		
		model.put("menu", list);
		return "admin/boardmenu";//뷰
		
	}
	

}
