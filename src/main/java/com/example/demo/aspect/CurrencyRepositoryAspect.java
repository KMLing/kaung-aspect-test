package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class CurrencyRepositoryAspect {
    @Before("this(com.example.demo.bls.CurrenciesRepository)")
    public void beforeThisCurrenciesRepository(){
        System.out.println("Before- this(CurrencyRepositoryImpl)");
    }

    @Before("target(com.example.demo.bls.CurrenciesRepository)")
    public void beforeTargetCurrenciesRepository(){
        System.out.println("Before- target(CurrencyRepositoryImpl)");
    }
}
