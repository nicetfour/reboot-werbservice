package com.reboot.retry.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void checkUrlHelloReturnValue() throws Exception {
        String urlReturnValue = "hello world!!!";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(urlReturnValue));
    }

    @Test
    public void checkHelloControllerDto() throws Exception {
        //given


        //when


        //test json으로 받아온 값이 맞는지 확인...그럴러면 GET으로도 여기서 던져야겠네.
        mvc.perform(get("/hello/dto"))


    }



}

















