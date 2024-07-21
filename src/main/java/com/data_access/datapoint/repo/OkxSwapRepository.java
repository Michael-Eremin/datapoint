package com.data_access.datapoint.repo;

import com.data_access.datapoint.data.entity.OkxSwapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OkxSwapRepository extends JpaRepository<OkxSwapEntity, Long> {
}
