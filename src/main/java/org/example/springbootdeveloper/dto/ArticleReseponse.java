package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Article;

@Getter
public class ArticleReseponse {
    public final String title;
    public final String content;

    public ArticleReseponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
