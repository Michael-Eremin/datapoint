package com.data_access.datapoint.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "okx_swap_24", schema = "crypto")
@NoArgsConstructor
@Getter
@Setter
public class OkxSwapEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="inst_type")
    private String instType;
    @Column(name="inst_id")
    private String instId;
    @Column(name="last")
    private String last;
    @Column(name="last_sz")
    private String lastSz;
    @Column(name="ask_px")
    private String askPx;
    @Column(name="ask_sz")
    private String askSz;
    @Column(name="bid_px")
    private String bidPx;
    @Column(name="bid_sz")
    private String bidSz;
    @Column(name="open24h")
    private String open24h;
    @Column(name="high24h")
    private String high24h;
    @Column(name="low24h")
    private String low24h;
    @Column(name="vol_ccy24h")
    private String volCcy24h;
    @Column(name="vol24h")
    private String vol24h;
    @Column(name="ts")
    private String ts;
    @Column(name="sod_utc0")
    private String sodUtc0;
    @Column(name="sod_utc8")
    private String sodUtc8;

    @Column(name="created_at", columnDefinition = "timestamp with time zone")
    private Date createdAt;

}
