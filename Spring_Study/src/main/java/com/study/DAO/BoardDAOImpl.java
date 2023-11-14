package com.study.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.study.DTO.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
	
	// 게시글 작성
	@Override
	public void write(BoardDTO boardDTO) throws Exception {
		sqlSession.insert("Mapper.insert", boardDTO);
		
	}
}
