package com.ll.exam.nana.answer;


import com.ll.exam.nana.article.Article;
import com.ll.exam.nana.article.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class AnswerController {
    private final ArticleRepository articleRepository;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
        List<Article> article = this.articleRepository.findAll();
        model.addAttribute("article", article);
        return "redirect:/article/list";
    }
}