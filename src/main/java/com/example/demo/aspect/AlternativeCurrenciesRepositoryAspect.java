package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class AlternativeCurrenciesRepositoryAspect {

    @Before("this(com.example.demo.bls.AlternativeCurrenciesRepository)")
    public void beforeThisCurrenciesRepository(){
        System.out.println("Before  - this(AlternativeCurrenciesRepositoryAspect)");
    }
    @Before("target(com.example.demo.bls.AlternativeCurrenciesRepository)")
    public void beforeTargetCurrenciesRepository(){
        System.out.println("Before  - target(AlternativeCurrenciesRepositoryAspect)");
    }
}
