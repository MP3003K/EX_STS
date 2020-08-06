package pe.edu.upeu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.hotel.entity.Cliente;
import pe.edu.upeu.hotel.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService hotelService;
	@GetMapping("/clientes")
	 public List<Cliente> readList(){
		 return hotelService.readAll();
	 }
}
