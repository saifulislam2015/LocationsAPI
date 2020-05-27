package com.api.repo;
import com.api.model.location;

import org.springframework.data.jpa.repository.JpaRepository;

public interface locationRepo extends JpaRepository<location,Long>{
    
}