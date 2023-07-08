package com.example.demo.bls;

import com.example.demo.annotation.InTransaction;
import com.example.demo.ds.CurrencyId;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("currency_service")
@Service
public class CurrencyService {
    @InTransaction(user = "Kaung Myat Ling",action = "Currency Service" ,date = "10/12/2021")
    public float getExchangeRate(String form,String to){
        System.out.println("in Currency Service/...");
        return 0F;
    }
    public float getExchangeRate(String from, String to, int multiplier){
        return 0F;
    }

    public String getCurrencyCountryName(CurrencyId currencyId){
        if(currencyId == CurrencyId.USD){
            return "USD";
        }else {
            throw new IllegalArgumentException("test");
        }
    }
}
