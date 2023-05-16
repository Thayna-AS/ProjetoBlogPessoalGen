package com.generation.blogpessoal.model;



import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_postagens")
public class Postagem {
	
	@Id // indica que este atributo será uma chave primária na minha tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que terá um auto-increment
	private long id;
	
	@NotBlank(message = "Preenchimento obrigatório")
	@Size(min = 5, max = 100, message= "Este campo deve ter no mínimo 5 caracteres e no máximo 100")
	private String titulo;
	@NotBlank(message = "Preenchimento obrigatório")
	@Size(min = 10, max = 1000, message= "Este campo deve ter no mínimo 10 caracteres e no máximo 1000")
	
	private String texto;
	
	@UpdateTimestamp
	
	private LocalDateTime date;
	
	
	
}
