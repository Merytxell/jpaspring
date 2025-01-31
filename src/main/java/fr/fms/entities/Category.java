package fr.fms.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany (mappedBy = "category")
	private Collection<Article>articles;
	
	public Category() {
		
	}
	public Category(String name) {
		this.name=name;
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

}
