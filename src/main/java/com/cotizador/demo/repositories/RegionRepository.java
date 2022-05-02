package com.cotizador.demo.repositories;

import com.cotizador.demo.models.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {
}
