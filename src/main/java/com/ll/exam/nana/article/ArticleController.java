package com.ll.exam.nana.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleRepository articleRepository;


    @GetMapping("/article/list")
    public String ArticleList(Model model){
        List<Article> articleList = articleRepository.findAll();
        model.addAttribute("articleList" , articleList);


        return "article_List";
    }
}
