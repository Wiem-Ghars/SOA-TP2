package service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class BanqueService {
	
public double conversion(double montant)
{return montant*10.6;}


public List<Compte> getComptes(){
	List<Compte> Comptes =new ArrayList<Compte>(); 
	Comptes.add(new Compte(1, Math.random()*55555, new Date()));
	Comptes.add(new Compte(2, Math.random()*55555, new Date()));
	Comptes.add(new Compte(3, Math.random()*55555, new Date()));
	return Comptes;
}


}
