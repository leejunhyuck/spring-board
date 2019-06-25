package org.zercok.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeDiffMapper;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {
	@Autowired
	TimeMapper mapper;
	
	@Autowired
	TimeDiffMapper diffmapper;
	
	
	@Test
	public void testTime2() {
		log.info(mapper.getTime2());
		
	}
	
	
	
	@Test
	public void testCalc() {
		log.info(diffmapper.claGap2("2019-01-01"));
		
	
	}
	
	
	@Test
	public void testnow() {
		log.info(mapper.getClass().getName());
		
		
	}
	

	
}
