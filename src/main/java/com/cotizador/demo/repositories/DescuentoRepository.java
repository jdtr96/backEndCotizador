package com.cotizador.demo.repositories;

import com.cotizador.demo.models.Descuento;
import com.cotizador.demo.models.Pais;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DescuentoRepository extends CrudRepository<Descuento, Long> {

    @Query(value = "SELECT * FROM descuento d WHERE d.codigo = :codigo", nativeQuery=true)
    Descuento findByCodigoDescuentp(@Param("codigo") String codigo);
}
