package src.FactuurApp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

class FactuurViewTest {

	   private FactuurView view;

	    @Before
	    public void setUp() {
	        view = new FactuurView();
	    }

	    @Test
	    public void testSetAndGetRelatie() {
	        view.setRelatie("Company ABC");
	        assertEquals("Company ABC", view.getRelatie());
	    }

	    @Test
	    public void testSetAndGetBtwPercentage() {
	        view.setBtwPercentage(21.0);
	        assertEquals(21.0, view.getBtwPercentage(), 0.01);
	    }

	    @Test
	    public void testSetAndGetPeriodiekeFactuurActief() {
	        view.setPeriodiekeFactuurActief(true);
	        assertTrue(view.isPeriodiekeFactuurActief());

	        view.setPeriodiekeFactuurActief(false);
	        assertFalse(view.isPeriodiekeFactuurActief());
	    }

	    @Test
	    public void testSetAndGetAutomatischeEmailing() {
	        view.setAutomatischeEmailing(true);
	        assertTrue(view.isAutomatischeEmailing());

	        view.setAutomatischeEmailing(false);
	        assertFalse(view.isAutomatischeEmailing());
	    }

	   
}
