package com.entelgy.retobackend.map;

import com.entelgy.retobackend.model.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerToResponseTest {

    @InjectMocks
    private ConsumerToResponse consumerToResponse;

    @Test
    public void ConsumerToResponse() {
        String expectResult = "1 | Bluth | george.bluth@reqres.in";

        Assertions.assertEquals(expectResult, consumerToResponse.ConsumerToResponse(this.getData()));

    }

    private Data getData() {
        Data data = new Data();
        data.setId(1);
        data.setEmail("george.bluth@reqres.in");
        data.setFirst_name("George");
        data.setLast_name("Bluth");
        data.setAvatar("https://reqres.in/img/faces/1-image.jpg");

        return data;

    }

}