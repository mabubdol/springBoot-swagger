package com.github.magicdol.swagger.customer;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    public List<Customer> retrieveCustomers();
}
