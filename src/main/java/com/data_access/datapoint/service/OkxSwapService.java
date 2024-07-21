package com.data_access.datapoint.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public interface OkxSwapService {

    public String getOkxSwapData();

}
