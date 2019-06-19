package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@ToString
@Log4j
@Service
public class Restaurant {
	
	@Setter(onMethod_ =@Autowired)
	private Chef chef;
	
	
	
	
	
	
	public void order() {
		
		System.out.println("pizza...");
		
	}


	
}
