package fr.uvsq.solid.pglp_4;

import java.util.ArrayList;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

import fr.uvsq.solid.pglp_4.Personnels.Builder;


public class AllTests {

	private Composite_Personnel composite1=new Composite_Personnel(1);
	private Composite_Personnel composite3=new Composite_Personnel(3);
	private Composite_Personnel composite4=new Composite_Personnel(4);
	private Personnels personnel2;
	private Personnels personnel6;
	private Personnels personnel7;
	private Personnels personnel5;
	ArrayList<Interface_Personnel> ip =new ArrayList<Interface_Personnel>();
	LocalDateTime temp ;
	
	@Before
	public void setup()
	{
		//creer 4 personnels et 3 composites ensuite les rajouter
		personnel2=new Personnels.Builder(2,"Nikiema", "Daouda").build();
		personnel6 =new Personnels.Builder(6,"Maiga", "Rahim").build();
		personnel7 =new Personnels.Builder(7,"Seni", "Allasane").build();
		personnel5 =new Personnels.Builder(5,"Barro ", "Drissa").build();
		composite1.add(personnel2);
		composite1.add(composite3);
		composite3.add(personnel5);
		composite3.add(composite4);
		composite4.add(personnel6);
		composite4.add(personnel7);
		ip.add(composite1);
		/*ip.add(personnel2);
		ip.add(composite3);
		ip.add(composite4);
		ip.add(personnel2);
		ip.add(personnel5);
		ip.add(personnel6);
		ip.add(personnel7);*/
	}
	@Test
	public void pglp41Test()
	{
		/*for(Interface_Personnel elt : ip)
		{
			if(elt instanceof Personnels)
			{	
				elt.affiche();
			}
			  else
				  if (elt instanceof Composite_Personnel)
				  {
					  ((Composite_Personnel) elt).affiche();
				  }  
				
			}*/
		//affichage simple
		System.out.println("afichage simple");
		composite1.affiche();
		
		/*
		 * affichahe par groupe cette fois ci
		 */
		Affichage_groupe affich=new Affichage_groupe(composite1);
		Iterator grouptIter = affich.getIterator();
		while (grouptIter.hasNext())
	   	{         
			Interface_Personnel nextValue=grouptIter.Next();
			System.out.println("affichage par groupe");
            System.out.println("La prochaine valeur de groupe est: " + nextValue.toString() );		
	     }	
       }
}











