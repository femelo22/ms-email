package br.com.email.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class Email implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String ownerEmail;
	
	private String emailFrom;
	
	private String emailTo;
	
	private String subject;
	
	private String text;
	
	private LocalDateTime sendDateEmail;
	
	private StatusEmail statusEmail;
	
	
	
}
