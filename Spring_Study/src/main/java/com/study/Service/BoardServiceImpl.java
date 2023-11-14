package com.study.Service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.DAO.BoardDAO;
import com.study.DTO.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardDTO boardDTO) throws Exception {
		dao.write(boardDTO);
	}

}
