package com.punsAndParadise.punsAndParadise.repository;

import com.punsAndParadise.punsAndParadise.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}