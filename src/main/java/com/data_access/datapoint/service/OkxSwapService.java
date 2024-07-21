package com.data_access.datapoint.service;

import com.data_access.datapoint.data.entity.OkxSwapEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public interface OkxSwapService {

    List<OkxSwapEntity> getOkxSwapData();

}
