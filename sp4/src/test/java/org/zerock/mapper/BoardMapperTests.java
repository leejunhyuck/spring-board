package org.zerock.mapper;


import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	@Autowired
	ReplyMapper mapper;
	
	private int[] bnoarr= {2041,2040,2037,2035,2033};
	
	
	
	@Test
	public void testList() {
		mapper.list(2041).forEach(vo ->log.info(vo));
		
		
	}
	
	
	@Test
	public void testList2() {
		mapper.delete(1102);
		
		
	}
	
	
	@Test
	public void testInsert() {
		
		IntStream.rangeClosed(1,10).forEach(i ->{
			
			ReplyVO vo = new ReplyVO();
			
			vo.setBno(bnoarr[i%5]);
			vo.setReply("댓글테스트"+i);
			vo.setReplyer("replyer"+i);
			
			mapper.insert(vo);
		});
		
		
		
		
	}

	
	
	
}
