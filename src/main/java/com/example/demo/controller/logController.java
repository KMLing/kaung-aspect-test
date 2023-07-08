package com.example.demo.controller;

import com.example.demo.bls.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/log")
@RestController
public class logController {
    @Autowired
    CurrencyService currencyService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResponseEntity<?> logThis(){
        currencyService.getExchangeRate("EUR","USD");

        return new ResponseEntity<>("called currencyService.",HttpStatus.OK);
    }

    @RequestMapping(value = "/log/hello",method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("Hello MotherFuckerssss...");
        currencyService.getExchangeRate("EUR","USD");

        return "HeeeeYYYY";
    }

}
