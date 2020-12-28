package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CalculatorController {
	  private final CalculatorServise calc;
	  @Autowired
	  public CalculatorController(CalculatorServise calc) {
		this.calc=calc;
	  }
	  
	  @GetMapping(path = "{first}/{operation}/{second}")
	  public String operation (@PathVariable("first") double first,@PathVariable("operation") String operation,@PathVariable("second") double second ) {
		return calc.operation(first, operation, second);
		  
	  }
	  
	  @GetMapping(path = "{operation}/{number}")
	  public String single (@PathVariable("operation") String operation,@PathVariable("number") double number ) {
		return calc.single(operation, number);
		  
	  }
  
  
}
