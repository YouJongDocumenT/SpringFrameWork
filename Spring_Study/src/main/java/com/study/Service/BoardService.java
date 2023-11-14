package com.study.Service;

import com.study.DTO.BoardDTO;

public interface BoardService {
	// 게시글 작성
		public void write(BoardDTO boardDTO) throws Exception;
		
	}
