package com.data_access.datapoint.service;

import com.data_access.datapoint.config.RestConfiguration;
import com.data_access.datapoint.repo.OkxSwapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OkxSwapServiceImpl implements OkxSwapService {
    private final RestTemplate restTemplate;
    private final OkxSwapRepository okxSwapRepository;

    public OkxSwapServiceImpl (
            @Autowired RestTemplate restTemplate,
            @Autowired OkxSwapRepository okxSwapRepository
    ) {
        this.restTemplate = restTemplate;
        this.okxSwapRepository = okxSwapRepository;
    }

    @Override
    public String getOkxSwapData() {
        String url = "https://www.okx.com/api/v5/market/tickers?instType=SWAP";
        String okxSwapData = restTemplate.getForObject(url, String.class);
        System.out.println(okxSwapData);
        return okxSwapData;
    }

}
