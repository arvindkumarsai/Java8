package com.karan.practice.practice.springcore.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean("accountService")
    //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public AccountService getAccountService() {
        return new AccountService();
    }
}
