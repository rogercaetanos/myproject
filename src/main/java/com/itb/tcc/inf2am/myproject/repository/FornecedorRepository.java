package com.itb.tcc.inf2am.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.tcc.inf2am.myproject.model.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{

}
