package com.entelgy.retobackend.map;

import com.entelgy.retobackend.commons.Constant;
import com.entelgy.retobackend.model.Data;
import com.entelgy.retobackend.model.Response;
import org.springframework.stereotype.Component;

@Component
public class ConsumerToResponse {

    public String ConsumerToResponse(Data data) {
        return data.getId() + Constant.VERTICAL_SLASH + data.getLast_name() +  Constant.VERTICAL_SLASH + data.getEmail();
    }
}
