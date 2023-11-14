package com.study.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.DTO.BoardDTO;
import com.study.Service.BoardService;

@Controller
@RequestMapping("/board/*")
public class LoginController {

private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	BoardService service;
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("writeView");
	}
	
	// 게시판 글 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(BoardDTO boardDTO) throws Exception {
		logger.info("write");
		
		service.write(boardDTO);
		
		return "redirect:/";
	}
	
}
