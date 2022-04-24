package com.entelgy.retobackend.proxy;

import com.entelgy.retobackend.commons.WsProperties;
import com.entelgy.retobackend.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;


@Component
public class UserConnection {

    public static Logger log = LogManager.getLogger(UserConnection.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WsProperties wsProperties;

    public User callRestServiceUser() {

        try {
            ResponseEntity<User> response = restTemplate.exchange(getUrlRegres(), HttpMethod.GET, null, new ParameterizedTypeReference<User>() {
            });
            return response.getBody();
        } catch (HttpClientErrorException ex) {
            log.error(ex.getMessage());
        }
        return null;
    }

    private String getUrlRegres() {
        return UriComponentsBuilder.fromHttpUrl(wsProperties.getReqresUser()).toUriString();
    }
}
