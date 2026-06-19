package com.example.Pagos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Pagos.model.Pagos;

@Repository
public interface PagosRepository extends JpaRepository<Pagos, Long> {

}
