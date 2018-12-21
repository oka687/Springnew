package com.bit.board.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.board.ReboardDao;
import com.bit.board.common.dao.CommonDao;
import com.bit.board.model.ReboardDto;

@Service
public class ReboardServiceImpl implements ReboardService {
	
	@Autowired
	private SqlSession sqlSession;
	
	

	@Override
	public int writeArticle(ReboardDto reboardDto) {
		
		int seq = sqlSession.getMapper(CommonDao.class).getNextSeq();
		reboardDto.setSeq(seq);
		reboardDto.setRef(seq);
		
		int cnt = sqlSession.getMapper(ReboardDao.class).writeArticle(reboardDto);
		
		return 0;
	}

	@Override
	public List<ReboardDto> listArticle(Map<String, String> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReboardDto viewArticle(int seq) {
		
		return sqlSession.getMapper(ReboardDao.class).
	}

	@Override
	public int replyArticle(ReboardDto reboardDto) {
		return null;
	}

	@Override
	public void modifyArticle(ReboardDto reboardDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(int seq) {
		// TODO Auto-generated method stub
		
	}

	

}
