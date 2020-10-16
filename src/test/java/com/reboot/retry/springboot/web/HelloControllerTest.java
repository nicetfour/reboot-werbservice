package com.reboot.retry.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void checkUrlHelloReturnValue() throws Exception {
        //given
        String urlReturnValue = "hello world!!!";

        //when then
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(urlReturnValue));
    }

    @Test
    public void checkHelloControllerDto() throws Exception {
        //given
        String name = "name";
        int amount = 1000;

        //when then
        //test json으로 받아온 값이 맞는지 확인...그럴러면 GET으로도 여기서 던져야겠네.
        mvc.perform(get("/hello/dto/?name=name&amount=1000"))
                .andExpect(jsonPath("$.name").value(name))
                .andExpect(jsonPath("$.amount").value(amount));
    }



}

















