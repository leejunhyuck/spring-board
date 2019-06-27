package org.zerock.mapper;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageMaker;

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
		vo.setTitle("너구리");
		vo.setContent("몰라");
		vo.setWriter("user01");
		mapper.insert(vo);
	}
	
	@Test
	public void testSelect() {
		BoardVO vo = mapper.select(5);
		log.info(vo);
	}
	
	@Test
	public void testupdate() {
		BoardVO vo = mapper.select(5);
		vo.setTitle("수정된 제목");
		vo.setContent("수정된 내용");
		
		int count = mapper.update(vo);
		
		log.info("update count :" + count);
	}
	
	@Test
	public void testDelete() {
		
		int count = mapper.delete(5);
		
		log.info("delete count : "+count);
		
	}
	
//	@Test
//	public void testPaging() {
//		
//		Criteria cri = new Criteria();
//		
//		mapper.selectPage(cri).forEach( vo -> log.info(vo)); {
//			
//		}
//		
//	}
	
	@Test
	public void testPageMaker() {
		Criteria cri = new Criteria();
		
		PageMaker pm = new PageMaker(cri,97);
		
		log.info(pm);
	}
	
	
	@Test
	public void testSerach() {
		Map<String, String> map = new HashMap<>();
		
		map.put("T", "샘플");
		
		mapper.search(map);
		
	}
	
}
