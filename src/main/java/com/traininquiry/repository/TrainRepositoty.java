package com.traininquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traininquiry.entity.Train;

@Repository
public interface TrainRepositoty  extends JpaRepository<Train,Integer>{

}
