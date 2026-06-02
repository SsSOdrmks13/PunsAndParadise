package com.punsAndParadise.punsAndParadise.repository;

import com.punsAndParadise.punsAndParadise.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
