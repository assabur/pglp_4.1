package fr.uvsq.solid.pglp_4;

import java.util.ArrayList;
/*
 * classe qui gere l'affichage par groupe
 */
public class Affichage_groupe{
	/*
	 * declaration des attributs
	 */
	private ArrayList<Interface_Personnel>tab=new ArrayList<Interface_Personnel>();
	/*
	 * methode qui prend en entré la racine de notre graphe d'hierarchie
	 */
	public Affichage_groupe (Interface_Personnel root)
	{
		this.tab.add(root);
	}
	
	/*
	 * methode qui retourne un nouveau iterateur
	 */
	public Iterator getIterator ()
	{
		return new GroupeIterator();
		
	}
	private class GroupeIterator implements Iterator
	{
		/*
		 * parcourir l'architecture en verifiant a chaque fois que l'instance est un composite ou pas
		 */
		public  GroupeIterator ()
		{
			int index =0;
			while (index < tab.size())
			{	
				if	(tab.get(index) instanceof Composite_Personnel)
				{	
					 for (Interface_Personnel personne : ((Composite_Personnel)tab.get(index)).personnel )
					{ 		      
				          tab.add(personne);		
				    }				
				}				
				index ++;
			}
		}
		int i=0;

		 /*
		 * methode qui verifie si il existe un suivant dans la hierarchie
		 */
		public boolean hasNext() {
			if (i < tab.size())			
			 return true;			
			 return false;
		}

		/*
		 * methode qui renvoie le prochain personnel dans la hierarchie
		 */
		public Interface_Personnel Next() {
			
			if (this.hasNext()){
				i++;
			return tab.get(i-1);
			}
			return null;
		}		
	}
}
