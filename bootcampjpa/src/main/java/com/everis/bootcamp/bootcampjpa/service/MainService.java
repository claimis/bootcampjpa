package com.everis.bootcamp.bootcampjpa.service;

import java.util.List;

import com.everis.bootcamp.bootcampjpa.vet.Vet;

public interface MainService {
	public String enviarService();
	
	public List<Vet> getVets();
	
	public Vet getVetId(String nombre);
}
