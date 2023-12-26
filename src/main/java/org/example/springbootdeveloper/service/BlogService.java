package org.example.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.domain.Article;
import org.example.springbootdeveloper.dto.AddArticleRequest;
import org.example.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NoutNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 모든 글 조회
    public List<Article> findAll() {
        return blogRepository.findAll();
    }
    // 특정 글 조회
    public Article findById(long id) {
        return blogRepository.findById(id) // 엔티티가 없을 경우 예외 발생
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    // 글 삭제
    public void delete(long id) {
        blogRepository.deleteById(id);
    }

}
