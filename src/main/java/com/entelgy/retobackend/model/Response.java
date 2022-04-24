package com.entelgy.retobackend.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Response {

    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public void addData(String data){
        if (Objects.isNull(this.data)){
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
}
