package src.FactuurApp;

import java.util.Date;

public class FactuurModel {
	private String relatie;
	private String factuurAdres;
	private String terAttentieVan;
	private int betaalTermijn;
	private double bedragExclBtw;
	private double bedragInclBtw;
	private double btwPercentage;
	//    private String factuurBtw;
	private String opmerking;
	private String gekoppeldeProject;
	private String referentie;
	private boolean isPeriodiekeFactuurActief;
	private boolean isAutomatischeEmailing;
	private String startDatum;
	private String eindDatum;
	//    private String factuurFrequentie;

	// Getters en setters voor alle velden
	public String getRelatie() {
		return relatie;
	}

	public void setRelatie(String relatie) {
		this.relatie = relatie;
	}

	public String getFactuurAdres() {
		return factuurAdres;
	}

	public void setFactuurAdres(String factuurAdres) {
		this.factuurAdres = factuurAdres;
	}

	public String getTerAttentieVan() {
		return terAttentieVan;
	}

	public void setTerAttentieVan(String terAttentieVan) {
		this.terAttentieVan = terAttentieVan;
	}

	public int getBetaalTermijn() {
		return betaalTermijn;
	}

	public void setBetaalTermijn(int betaalTermijn) {
		this.betaalTermijn = betaalTermijn;
	}

	public double getBedragExclBtw() {
		return bedragExclBtw;
	}

	public void setBedragExclBtw(double bedragExclBtw) {
		this.bedragExclBtw = bedragExclBtw;
		this.bedragInclBtw = bedragExclBtw * (1 + (btwPercentage / 100));
	}

	public double getBedragInclBtw() {
		return bedragInclBtw;
	}

	public void setBedragInclBtw(double bedragInclBtw) {
		this.bedragInclBtw = bedragInclBtw;
		this.bedragExclBtw = bedragInclBtw / (1 + (btwPercentage / 100));
	}

	public double getBtwPercentage() {
		return btwPercentage;
	}

	public void setBtwPercentage(double btwPercentage) {
		this.btwPercentage = btwPercentage;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}

	public String getGekoppeldeProject() {
		return gekoppeldeProject;
	}

	public void setGekoppeldeProject(String gekoppeldeProject) {
		this.gekoppeldeProject = gekoppeldeProject;
	}

	public String getReferentie() {
		return referentie;
	}

	public void setReferentie(String referentie) {
		this.referentie = referentie;
	}

	public boolean isPeriodiekeFactuurActief() {
		return isPeriodiekeFactuurActief;
	}

	public void setPeriodiekeFactuurActief(boolean periodiekeFactuurActief) {
		isPeriodiekeFactuurActief = periodiekeFactuurActief;
	}

	public boolean isAutomatischeEmailing() {
		return isAutomatischeEmailing;
	}

	public void setAutomatischeEmailing(boolean automatischeEmailing) {
		isAutomatischeEmailing = automatischeEmailing;
	}

	public String getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(String startDatum) {
		this.startDatum = startDatum;
	}

	public String getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(String eindDatum) {
		this.eindDatum = eindDatum;
	}

	//    public String getFactuurFrequentie() {
	//        return factuurFrequentie;
	//    }
	//
	//    public void setFactuurFrequentie(String factuurFrequentie) {
	//        this.factuurFrequentie = factuurFrequentie;
	//    }
	//    
	public String getInvoiceSummary() {
		StringBuilder summary = new StringBuilder();
		summary.append("Factuur Samenvatting:\n");
		summary.append("Relatie: ").append(relatie).append("\n");
		summary.append("Factuuradres: ").append(factuurAdres).append("\n");
		summary.append("Ter attentie van: ").append(terAttentieVan).append("\n");
		summary.append("Betaaltermijn: ").append(betaalTermijn).append(" dagen\n");
		summary.append("Bedrag (excl. btw): ").append(bedragExclBtw).append("\n");
		summary.append("Bedrag (incl. btw): ").append(bedragInclBtw).append("\n");
		summary.append("Btw percentage: ").append(btwPercentage).append("%\n");
		//        summary.append("Factuur btw: ").append(factuurBtw).append("\n");
		summary.append("Werk omschrijving: ").append(opmerking).append("\n");
		summary.append("Gekoppeld project: ").append(gekoppeldeProject).append("\n");
		summary.append("Referentie: ").append(referentie).append("\n");
		summary.append("Periodieke factuur actief: ").append(isPeriodiekeFactuurActief).append("\n");
		summary.append("Automatische emailing: ").append(isAutomatischeEmailing).append("\n");
		summary.append("Startdatum: ").append(startDatum).append("\n");
		summary.append("Einddatum: ").append(eindDatum).append("\n");
		//        summary.append("Factuur frequentie: ").append(factuurFrequentie).append("\n");
		return summary.toString();
	}
}