package com.oyl.book.springboot.web;

import com.oyl.book.springboot.service.posts.PostsService;
import com.oyl.book.springboot.web.dto.PostSaveRequestDto;
import com.oyl.book.springboot.web.dto.PostsResponseDto;
import com.oyl.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

}
