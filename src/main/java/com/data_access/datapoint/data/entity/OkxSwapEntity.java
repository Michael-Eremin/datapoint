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

    @Column(name="inst_type", columnDefinition = "varchar(8)")
    private String instType;
    @Column(name="inst_id", columnDefinition = "varchar(32)")
    private String instId;
    @Column(name="last", columnDefinition = "varchar(32)")
    private String last;
    @Column(name="last_sz", columnDefinition = "varchar(32)")
    private String lastSz;
    @Column(name="ask_px", columnDefinition = "varchar(32)")
    private String askPx;
    @Column(name="ask_sz", columnDefinition = "varchar(32)")
    private String askSz;
    @Column(name="bid_px", columnDefinition = "varchar(32)")
    private String bidPx;
    @Column(name="bid_sz", columnDefinition = "varchar(32)")
    private String bidSz;
    @Column(name="open24h", columnDefinition = "varchar(32)")
    private String open24h;
    @Column(name="high24h", columnDefinition = "varchar(32)")
    private String high24h;
    @Column(name="low24h", columnDefinition = "varchar(32)")
    private String low24h;
    @Column(name="vol_ccy24h", columnDefinition = "varchar(32)")
    private String volCcy24h;
    @Column(name="vol24h", columnDefinition = "varchar(32)")
    private String vol24h;
    @Column(name="ts", columnDefinition = "varchar(32)")
    private String ts;
    @Column(name="sod_utc0", columnDefinition = "varchar(32)")
    private String sodUtc0;
    @Column(name="sod_utc8", columnDefinition = "varchar(32)")
    private String sodUtc8;

    @Column(name="created_at", nullable = false, columnDefinition = "timestamp with time zone default now()")
    private Date createdAt;

}
