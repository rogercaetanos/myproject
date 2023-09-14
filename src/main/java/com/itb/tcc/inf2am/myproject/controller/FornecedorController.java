package com.itb.tcc.inf2am.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myproject/fornecedor")
public class FornecedorController {
	
	
	
  
  @GetMapping("/novo-fornecedor")
  public String novoFornecedor() {
	  
	  return null;
  }
	

}
