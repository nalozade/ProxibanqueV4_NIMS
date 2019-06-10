package org.bank.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * La classe Manager est un javabean qui regroupe les informations concernant un
 * manager son id,nom,prenom,login et password
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idManager;
	private String lastName;
	private String firstName;
	private String login;
	private String password;

	@OneToMany(mappedBy = "manager", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<Advisor> listAdvisor = new ArrayList<>();

	public Manager() {
		super();
	}

	public Manager(String lastName, String firstName, String login, String password, List<Advisor> listAdvisor) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
		this.listAdvisor = listAdvisor;
	}

	public Manager(String lastName, String firstName, String login, String password) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
	}

	public Long getIdManager() {
		return idManager;
	}

	public void setIdManager(Long idManager) {
		this.idManager = idManager;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Advisor> getListAdvisor() {
		return listAdvisor;
	}

	public void setListAdvisor(List<Advisor> listAdvisor) {
		this.listAdvisor = listAdvisor;
	}

	@Override
	public String toString() {
		return "Manager [idManager=" + idManager + ", lastName=" + lastName + ", firstName=" + firstName + ", login="
				+ login + ", password=" + password + ", listAdvisor=" + listAdvisor + "]";
	}

}
