package br.com.email.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.email.enums.StatusEmail;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class Email implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String ownerRef;
	
	private String emailFrom;
	
	private String emailTo;
	
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	private String text;
	
	private LocalDateTime sendDateEmail;
	
	private StatusEmail statusEmail;
	
	
	
}
