package org.example.yrShin.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void testLombok(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
