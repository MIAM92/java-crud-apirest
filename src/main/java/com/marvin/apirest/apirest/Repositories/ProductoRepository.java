package com.marvin.apirest.apirest.Repositories;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import com.marvin.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Optional<Producto> findById(Log id);

}
