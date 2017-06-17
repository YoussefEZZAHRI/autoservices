package com.piece.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class PieceController {
	@RequestMapping("/piece")
	public String index(){
		return "index";
		}
}
