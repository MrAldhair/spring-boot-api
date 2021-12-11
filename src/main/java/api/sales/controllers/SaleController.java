package api.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import api.sales.models.Sale;
import api.sales.services.ServiceSaleImplement;

@RestController
public class SaleController {
	
	@Autowired
	private ServiceSaleImplement serviceSaleImplement;
	
	@PostMapping("/crear")//change name
	@ResponseStatus(HttpStatus.CREATED)
	public Sale create(@RequestBody Sale sale) {
		
		return serviceSaleImplement.save(sale);
	
	}
	
	@GetMapping("/listar") // change name
	public List<Sale> mostrar() {
		
		return serviceSaleImplement.findAll();	
		
	}

}
