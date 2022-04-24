package com.entelgy.retobackend.service;

import com.entelgy.retobackend.map.ConsumerToResponse;
import com.entelgy.retobackend.model.Data;
import com.entelgy.retobackend.model.Response;
import com.entelgy.retobackend.proxy.UserConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConnection userConnection;

    @Autowired
    private ConsumerToResponse consumerToResponse;

    @Override
    public Response response() {
        Response r = new Response();
        r.setData(userConnection.callRestServiceUser().getData().stream()
                .map(consumerToResponse::ConsumerToResponse)
                .collect(Collectors.toList()));
        return r ;
    }


}
