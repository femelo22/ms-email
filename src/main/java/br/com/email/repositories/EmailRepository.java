package br.com.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.email.entities.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, UUID>{

}
