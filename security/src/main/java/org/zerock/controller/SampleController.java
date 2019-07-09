package org.zerock.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	@GetMapping("/all")
	  public void doAll() {
	    
	    log.info("do all can access everybody");
	  }
	  
	  @GetMapping("/member")
	  public void doMember() {
	    
	    log.info("logined member");
	  }
	  
	  @PreAuthorize("hasRole('ROLE_ADMIN') && principal.username==#uid")
	  @GetMapping("/admin")
	  public void doAdmin(@RequestParam("uid") String uid) {
	    
		log.info("UID : "+ uid );  
	    log.info("admin only");
	  }  
	  
	  @PreAuthorize("hasRole('ROLE_MEMBER')")
	  @GetMapping("/manage")
	  public void doManager() {
	    
	    log.info("manage, admin only");
	  }  
	  
}
