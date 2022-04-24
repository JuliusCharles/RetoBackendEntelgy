package com.entelgy.retobackend.commons;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConfigurationProperties(prefix = "ws")
public class WsProperties {

    private String reqresUser;

    public String getReqresUser() {
        return reqresUser;
    }

    public void setReqresUser(String reqresUser) {
        this.reqresUser = reqresUser;
    }
}
