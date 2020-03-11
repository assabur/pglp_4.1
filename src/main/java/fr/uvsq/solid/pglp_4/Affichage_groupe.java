package fr.uvsq.solid.pglp_4;

import java.util.ArrayList;

public class Affichage_groupe   {
	
	private ArrayList<Interface_Personnel> tab=new ArrayList<Interface_Personnel>();
	
	public void Affiche_groupe (Interface_Personnel root)
	{
		this.tab.add(root);
	
	}

	private class GroupeIterator implements Iterator
	{
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
				
				
				//if(tab.get(index) instanceof Personnels)
				}
				
				
			}
		}
		int index=0;

		public boolean hasNext() {
			if (index < tab.size())
			 return true;
			return false;
		}

		public Interface_Personnel Next() {
			
			if (hasNext())
			return tab.get(index +1);
			return null;
		}
		
		public Iterator getIterator ()
		{
			return new GroupeIterator();
			
		}
		
	}

}
