package org.zercok.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void boardtest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("하이");
		vo.setContent("헬로우");
		vo.setWriter("하이");
		mapper.insert(vo);
	}
	
	@Test
	public void testSelect() {
		BoardVO vo = mapper.select(5);
		log.info(vo);
	}
	
}
