package com.example.counterservice.ds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CounterServiceRequest {
    private int number;

    public CounterServiceRequest(@JsonProperty int number) {
        this.number = number;
    }
}
