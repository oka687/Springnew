package com.bit.board.admin.service;

import java.util.List;


import com.bit.board.admin.model.BoardListDto;
import com.bit.board.admin.model.BoardTypeDto;
import com.bit.board.admin.model.CatagoryDto;

public interface BoardAdminService {
	

	
	List<BoardListDto> getBoardMenu(); //게시판 전체 목록을 불러오는 일
	
	List<CatagoryDto> getCategory();//게시판을 요소 하나를 불러오는 일
	void makeCategory(CatagoryDto categoryDto);//게시판을 만드는 일
	List<BoardTypeDto> getBoardType();//게시판의 종류를 설정
	void makeBoard(BoardListDto boardListDto);//게시판을 DB에 삽입
	


}
