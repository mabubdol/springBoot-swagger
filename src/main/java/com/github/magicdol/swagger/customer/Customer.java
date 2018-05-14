package com.github.magicdol.swagger.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Customer {
    @JsonProperty
    private int customerNumber = 0;

    @JsonProperty
    private String customerName = "";

    @JsonProperty
    private String contactLastName = "";

    @JsonProperty
    private String contactFirstName = "";
}
