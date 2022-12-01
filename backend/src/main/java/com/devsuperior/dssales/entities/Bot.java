package com.devsuperior.dssales.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_bot")
public class Bot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;

	@OneToMany(mappedBy = "bot")
	private Set<Acordo> acordos = new HashSet<>();

	public Bot() {
	}

	public Bot(Long id, String description) {
		this.id = id;
		this.description = description;
	}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Acordo> getAcordos() {
		return acordos;
	}
}