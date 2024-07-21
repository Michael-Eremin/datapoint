package com.data_access.datapoint.config;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RestConfiguration {
    private Environment env;

    public RestConfiguration(@Autowired Environment env) {
        this.env = env;
    }

    @Bean
    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
//
//    private ClientHttpRequestFactory getClientHttpRequestFactory() {
//        int timeout = 10000;
//        RequestConfig config = RequestConfig.custom()
//                .setConnectTimeout(timeout)
//                .setConnectionRequestTimeout(timeout)
//                .setSocketTimeout(timeout)
//                .build();
//        CloseableHttpClient client = HttpClientBuilder
//                .create()
//                .setDefaultRequestConfig(config)
//                .build();
//        return new HttpComponentsClientHttpRequestFactory(client);
//    }

}

