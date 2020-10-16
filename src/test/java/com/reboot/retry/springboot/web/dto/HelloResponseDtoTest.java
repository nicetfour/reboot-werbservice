package com.reboot.retry.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void checkDtoFunction() throws Exception {
        //given
        String name = "홍길동";
        int amount = 20;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getName()).isEqualTo(name);
    }
}
