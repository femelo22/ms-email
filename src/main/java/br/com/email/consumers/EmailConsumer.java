package br.com.email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.email.dto.EmailDTO;
import br.com.email.entities.Email;
import br.com.email.services.EmailService;

@Component
public class EmailConsumer {
	
	/**
	 * Essa classe é responsavel por ficar escutando a nossa fila
	 */
	
	@Autowired
	EmailService emailService;
	
	
	@RabbitListener(queues = "${spring.rabbitmq.queue}")
	public void listen(@Payload EmailDTO dto) {
		Email email = new Email();
		BeanUtils.copyProperties(dto, email);
		emailService.sendEmail(email);
		System.out.println("Email Status: " + email.getStatusEmail().toString());
		
	}
	
	

}
