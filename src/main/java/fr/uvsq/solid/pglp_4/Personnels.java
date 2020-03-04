package fr.uvsq.solid.pglp_4;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class  Personnels implements Interface_Personnel  {
 private int id;
 private String nom;
 private String prenom;
 private String fonction;
 private LocalDateTime date_naiss;
 private ArrayList<Integer> telephone =new ArrayList<Integer>();
  public void affiche()
	{
		System.out.println("Id: "+this.id+" Nom: "+this.nom+" Prenom: "+this.prenom);
		
	}
	
}
