package fr.uvsq.solid.pglp_4;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class  Personnels implements Interface_Personnel  {
	
	
	private Personnels(Builder builder)
	{
		  //parametres requis 
		   id=builder.id;
		   nom=builder.nom;
		   prenom=builder.prenom;	 
		   
		  
		  //parametre optionels
		    telephone =builder.telephone;	  
		    fonction=builder.fonction;
		    date_naiss=builder.date_naiss;
	}
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
  public static class Builder
  {
	  //parametres requis 
	  private int id;
	  private String nom;
	  private String prenom;	 
	 
	  
	  //parametre optionels
	  private LocalDateTime date_naiss;
	  private ArrayList<Integer> telephone =new ArrayList<Integer>();	  
	  private String fonction;
	  public Builder(int id,String nom,String prenom)
	  {
		  this.id=id;
		  this.nom=nom;
		  this.prenom=prenom;
		  
	  }
	  public Builder fonction_change(String new_fonction)
	  {
		  fonction=new_fonction;
		  return this;
		  
	  }
	  public Builder telephone_change(ArrayList<Integer> new_telephone)
	  {
		  telephone=new_telephone;
		  return this;
		  
	  }
	  public Personnels build()
	  {
		  return new Personnels(this);
		  
	  }
	  
  }
  
	
}
