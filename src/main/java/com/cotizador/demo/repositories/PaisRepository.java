package com.cotizador.demo.repositories;

import com.cotizador.demo.models.Pais;
import com.cotizador.demo.models.Paises;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Long> {


    @Query(value = "SELECT * FROM pais p WHERE p.region_id = :id", nativeQuery=true)
    ArrayList<Pais> findByCodigo(@Param("id") Integer id);

}
