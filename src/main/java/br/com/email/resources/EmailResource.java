package br.com.email.resources;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.email.dto.EmailDTO;
import br.com.email.entities.Email;
import br.com.email.services.EmailService;

@RestController
public class EmailResource {

	
	@Autowired
	EmailService service;
	
	@PostMapping("/send-email")
	public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDTO dto) {
		Email email = new Email();
		BeanUtils.copyProperties(dto, email);
		service.sendEmail(email);
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}
}
