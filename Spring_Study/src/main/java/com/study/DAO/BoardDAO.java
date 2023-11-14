package com.study.DAO;

import com.study.DTO.BoardDTO;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardDTO boardDTO) throws Exception;
		
}
