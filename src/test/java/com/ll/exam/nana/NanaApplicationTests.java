package com.ll.exam.nana;

import com.ll.exam.nana.article.Article;
import com.ll.exam.nana.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class NanaApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;
	@Test
	void contextLoads() {
		Article q1 = new Article();
		q1.setSubject("제목1");
		q1.setContent("내용1");
		q1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(q1);


	}

}
