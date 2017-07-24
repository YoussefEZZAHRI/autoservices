package com.piece.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PieceController {
	@RequestMapping("/piece")
	public String index(){
		return "index";
		}
}
