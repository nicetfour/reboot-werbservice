package com.reboot.retry.springboot.domain.posts;

import com.reboot.retry.springboot.domain.post.Posts;
import com.reboot.retry.springboot.domain.post.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void callSaveNoticeBoard() {
        //given - 생성한 데이터를 주고
        postsRepository.save(Posts.builder()
                .title("홍길동")
                .content("의적의 일대기")
                .author("허균")
                .build());

        //when - 데이터를 조회했을때
        List<Posts> postsList = postsRepository.findAll();

        //then - 데이터를 평가
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("홍길동"));
    }
}
