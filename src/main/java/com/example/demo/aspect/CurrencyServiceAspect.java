package com.example.demo.aspect;


import com.example.demo.annotation.InTransaction;
import com.example.demo.bls.CurrencyService;
import com.example.demo.entity.Log;
import com.example.demo.ropo.LogRepo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.reflect.Method;

@Aspect
@Component
public class CurrencyServiceAspect {

    @Autowired
    private LogRepo logRepo;

    @Pointcut("@annotation(com.example.demo.annotation.InTransaction)")
    public void transactionAnnotationPointcut(){



    }
    @Before("transactionAnnotationPointcut()")
    public void beforeTransactionAnnotationAdvice(){

        System.out.println("Called Aspect");

        Method[] methods = CurrencyService.class.getMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(InTransaction.class)) {
                InTransaction anMember = m.getAnnotation(InTransaction.class);
                Log log=new Log();
                log.setUser(anMember.user());
                log.setTime(anMember.date());
                log.setAction(anMember.action());

                logRepo.save(log);


                System.out.println(anMember.user());
                System.out.println(anMember.action());
                System.out.println(anMember.date());
            }
        }
        System.out.println("I reached here......");
        System.out.println("Before -transactionAnnotationPointcut By Intransaction pointcut");
    }




}
