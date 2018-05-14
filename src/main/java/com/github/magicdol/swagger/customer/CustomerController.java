package com.github.magicdol.swagger.customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="onlinestore", description="Customer 관리")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @ApiOperation(value = "Customer 목록 조회")
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Customer>> retrieveCustomers(){
        return new ResponseEntity<List<Customer>>(customerService.retrieveCustomers(), HttpStatus.OK);
    }
}
