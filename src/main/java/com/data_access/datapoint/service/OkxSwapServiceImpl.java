package com.data_access.datapoint.service;

import com.data_access.datapoint.config.RestConfiguration;
import com.data_access.datapoint.data.entity.OkxSwapEntity;
import com.data_access.datapoint.data.response.OkxSwapResp;
import com.data_access.datapoint.repo.OkxSwapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    public List<OkxSwapEntity> getOkxSwapData() {
        String url = "https://www.okx.com/api/v5/market/tickers?instType=SWAP";
        OkxSwapResp okxSwapResp = restTemplate.getForObject(url, OkxSwapResp.class);
        List<OkxSwapEntity> okxSwapEntities = okxSwapResp.getData();
        okxSwapRepository.saveAll(okxSwapEntities);
        System.out.println(okxSwapEntities.toString());
        return okxSwapEntities;
    }

}
