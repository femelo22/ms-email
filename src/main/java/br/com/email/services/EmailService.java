package br.com.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.email.repositories.EmailRepository;

@Service
public class EmailService {

	
	@Autowired
	EmailRepository repository;
	
	
}
