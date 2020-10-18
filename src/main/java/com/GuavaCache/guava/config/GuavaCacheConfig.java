package com.GuavaCache.guava.config;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.net.http.HttpClient;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class GuavaCacheConfig {

    @Bean
    public CacheManager cacheManager(){
        GuavaCacheM cacheManager = new GuavaCacheManager()
        cacheManager.s
    }
}
