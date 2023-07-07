package com.ll.exam.nana.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/article")
@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleRepository articleRepository;


    @GetMapping("/list")
    public String ArticleList(Model model){
        List<Article> articleList = articleRepository.findAll();
        model.addAttribute("articleList" , articleList);


        return "article_List";
    }
    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Article article = articleRepository.findById();
        model.addAttribute("article", article);
        return "article_detail";
    }


}
