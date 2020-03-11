package fr.uvsq.solid.pglp_4;

import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

import fr.uvsq.solid.pglp_4.Personnels.Builder;


public class AllTests {

	private Composite_Personnel composite1;
	private Composite_Personnel composite3;
	private Composite_Personnel composite4;
	private Builder personnel2;
	private Personnels personnel6;
	private Personnels personnel7;
	private Personnels personnel5;
	LocalDateTime temp ;
	
	@Before
	public void setup()
	{
		//creer 4 personnels et 3 composites ensuite les rajouter
		personnel2 =new Personnels.Builder(1,"Nikiema","Daouda",temp.withDayOfMonth(4).withMonth(4).withYear(1994));
	}
	@Test
	public void pglp41Test()
	{
		
	}

}
