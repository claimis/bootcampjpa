package com.everis.bootcamp.bootcampjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.bootcamp.bootcampjpa.vet.Vet;
import com.everis.bootcamp.bootcampjpa.vet.VetRepository;

@Service
public class PruebaService implements MainService {
	
	@Autowired
	private VetRepository v;
	
	public String enviarService()
	{
		return "Enviado prueba servicio";
	}

	@Override
	public List<Vet> getVets() {
		// TODO Auto-generated method stub
		return v.findAll();
	}
	
	@Override
	public Vet getVetId(String nombre) {
		// TODO Auto-generated method stub
		return v.firstByFirstname(nombre);
	}
	
	
	
	
	

}
