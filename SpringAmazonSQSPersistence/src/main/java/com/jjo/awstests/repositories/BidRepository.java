package com.jjo.h2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jjo.h2.model.BidEntity;

public interface BidRepository extends JpaRepository<BidEntity, Long> {

}