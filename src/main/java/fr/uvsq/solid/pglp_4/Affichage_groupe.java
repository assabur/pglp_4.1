package fr.uvsq.solid.pglp_4;

import java.util.ArrayList;

public class Affichage_groupe   {
	
	private ArrayList<Interface_Personnel> tab=new ArrayList<Interface_Personnel>();
	
	public Affichage_groupe (Interface_Personnel root)
	{
		this.tab.add(root);
	
	}
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
				//((Composite_Personnel)tab.get(index)).personnel.get(index);
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

	
		public boolean hasNext() {
			if (i < tab.size())			
			 return true;			
			 return false;
		}

/*
 * (non-Javadoc)
 * @see fr.uvsq.solid.pglp_4.Iterator#Next()
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
