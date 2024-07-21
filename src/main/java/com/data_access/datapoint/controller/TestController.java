package com.data_access.datapoint.controller;

import com.data_access.datapoint.data.entity.OkxSwapEntity;
import com.data_access.datapoint.service.OkxSwapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/data")
public class TestController {
    private final OkxSwapService okxSwapService;

    public TestController(
             @Autowired OkxSwapService okxSwapService) {
        this.okxSwapService = okxSwapService;
    }

    @GetMapping("/okx")
    List<OkxSwapEntity> getOrdersProjection() {
        return okxSwapService.getOkxSwapData();
    }


}
