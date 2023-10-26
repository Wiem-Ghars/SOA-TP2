package service;

import java.util.Date;

public class Compte {
	double code;
	double solde;
	Date dateCreation;
	public Compte(int code, double solde, Date dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public double getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String getCompte(int code) {
		return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
	}
	
		
	} 
	
	

