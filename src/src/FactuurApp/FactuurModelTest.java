/**
 * 
 */
package src.FactuurApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class FactuurModelTest {

	@Test
	void test() {
			FactuurModel factuur = new FactuurModel();
			factuur.setRelatie("Company ABC");
			factuur.setFactuurAdres("123 Main St, City");
			factuur.setTerAttentieVan("John Doe");
			factuur.setBetaalTermijn(30);
			factuur.setBedragExclBtw(1000.0);
			factuur.setBtwPercentage(21.0);
			factuur.setOpmerking("Product purchase");
			factuur.setGekoppeldeProject("Project XYZ");
			factuur.setReferentie("REF123");
			factuur.setPeriodiekeFactuurActief(true);
			factuur.setAutomatischeEmailing(false);
			factuur.setStartDatum("2024-03-01");
			factuur.setEindDatum("2024-03-31");

			String expectedSummary = "Factuur Samenvatting:\n" +
					"Relatie: Company ABC\n" +
					"Factuuradres: 123 Main St, City\n" +
					"Ter attentie van: John Doe\n" +
					"Betaaltermijn: 30 dagen\n" +
					"Bedrag (excl. btw): 1000.0\n" +
					"Bedrag (incl. btw): 1000.0\n" +
					"Btw percentage: 21.0%\n" +
					"Werk omschrijving: Product purchase\n" +
					"Gekoppeld project: Project XYZ\n" +
					"Referentie: REF123\n" +
					"Periodieke factuur actief: true\n" +
					"Automatische emailing: false\n" +
					"Startdatum: 2024-03-01\n" +
					"Einddatum: 2024-03-31\n";

			assertEquals(expectedSummary, factuur.getInvoiceSummary());
		
	}
}

