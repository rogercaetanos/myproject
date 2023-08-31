package com.itb.tcc.inf2am.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.tcc.inf2am.myproject.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
