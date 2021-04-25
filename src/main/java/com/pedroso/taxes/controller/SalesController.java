package com.pedroso.taxes.controller;

import com.pedroso.taxes.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sales {

    @RequestMapping("/")
    public String hello(Product product){
        return "Hella";
    }

}
