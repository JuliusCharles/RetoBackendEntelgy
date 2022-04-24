package com.entelgy.retobackend.service;

import com.entelgy.retobackend.map.ConsumerToResponse;
import com.entelgy.retobackend.model.Data;
import com.entelgy.retobackend.model.Response;
import com.entelgy.retobackend.model.User;
import com.entelgy.retobackend.proxy.UserConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
class UserServiceImplTest {

    @Mock
    private UserConnection userConnection;

    @Mock
    private ConsumerToResponse consumerToResponse;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void response() {
        User user = new User();
        List<Data> data = new ArrayList<>();
        data.add(this.getData());
        user.setData(data);

        Response expectResponse = new Response();
        expectResponse.setData(Arrays.asList("1 | Bluth | george.bluth@reqres.in"));

        when(userConnection.callRestServiceUser()).thenReturn(user);

        System.out.println(expectResponse.getData());
        System.out.println( userService.response().getData());

        Assertions.assertEquals(expectResponse, userService.response());
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