package com.ll.exam.nana.article;

import com.ll.exam.nana.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Article findById();
}
