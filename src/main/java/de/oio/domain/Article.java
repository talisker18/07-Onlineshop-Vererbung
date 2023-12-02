package de.oio.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String number;
	private String name;
	private String description;
	
	@Embedded
	private MonetaryAmount monetaryAmount;
	
	@ManyToMany(mappedBy = "articles")
	private Set<Order> orders = new HashSet<Order>();
	
	@ElementCollection
	private List<UserComment> userComments = new ArrayList<UserComment>();
	
	@ElementCollection
	private List<String> alternativeNames = new ArrayList<String>();
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MonetaryAmount getMonetaryAmount() {
		return monetaryAmount;
	}

	public void setMonetaryAmount(MonetaryAmount monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	public void addToUserComments(UserComment uc) {
		this.userComments.add(uc);
	}
	
	public void addAlternativeName(String name) {
		this.alternativeNames.add(name);
	}
}
