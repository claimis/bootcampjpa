package com.everis.bootcamp.bootcampjpa.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	public Owner findById(int id) {
		return this.ownerRepository.findById(id);
	}
	
}
