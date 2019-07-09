package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperTests {
	
	@Autowired
	private TimeMapper timeMapper;
	@Autowired
	private MemberMapper Mapper;
	
	@Test
	public void testTime() {
		
		log.info(timeMapper.getTime());
		
		
	}
	
	@Test
	public void testMember() {
		
	
		MemberVO vo = Mapper.read("admin95");
		log.info(vo);
	}
	
}
