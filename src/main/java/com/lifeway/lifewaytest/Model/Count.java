package com.lifeway.lifewaytest.Model;

import org.springframework.stereotype.Component;

@Component
public class Count {

    private int count;



    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
