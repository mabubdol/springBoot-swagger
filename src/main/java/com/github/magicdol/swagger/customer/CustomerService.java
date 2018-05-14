package com.github.magicdol.swagger.customer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer>retrieveCustomers() {
        LOGGER.debug("테스트");
        return customerMapper.retrieveCustomers();}
}
