package fr.uvsq.solid.pglp_4;

import java.util.ArrayList;

public class Composite_Personnel implements Interface_Personnel {
	private int id;
	public ArrayList<Interface_Personnel> personnel=new ArrayList<Interface_Personnel>();
	public void affiche()
	{	
		for (Interface_Personnel interfaceP: personnel )
		{
			interfaceP.affiche();
		}
	}
	
	public void add (Interface_Personnel ip)
	{
		personnel.add(ip);
	}
	
	public void remove(Interface_Personnel ip)
	{
		personnel.remove(ip);
	}
}

