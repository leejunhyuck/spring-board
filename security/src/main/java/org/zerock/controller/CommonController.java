package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {

	@RequestMapping("/accessError")
	public void accessError() {
		
		
		log.info("access error page call");
		
	}
	
	@RequestMapping("/customLogin")
	public void customLogin() {

		log.info("login page");

	}
	
	@GetMapping("/customLogout")
	public void customLogout() {
		
		log.info("logout page");
		
	}
	
}
