package fr.uvsq.solid.pglp_4;

public class Affichage_groupe implements Iterator  {

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public Interface_Personnel Next() {
		// TODO Auto-generated method stub
		return null;
	}
	private class GroupeIterator implements Iterator
	{

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public Interface_Personnel Next() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Iterator getIterator ()
		{
			return new GroupeIterator();
			
		}
		
	}

}
