package src.FactuurApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FactuurView extends JPanel {

	private JTextField relatieField, adresField, attentieField, termijnField, bedragExclField, btwPercentageField,
					   opmerkingField, projectField, referentieField;
	private JCheckBox periodiekeCheckBox, emailCheckBox;
	private JButton saveButton, previewButton;
	private JTextArea resultArea;
	private JFormattedTextField startDatumField, eindDatumField;

	public FactuurView() {
		setLayout(new GridLayout(0, 2, 5, 5)); // Grid layout met 2 kolommen
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		// Initialisatie van GUI-componenten
		relatieField = new JTextField(20);
		adresField = new JTextField(20);
		attentieField = new JTextField(20);
		termijnField = new JTextField(5);
		bedragExclField = new JTextField(10);
		btwPercentageField = new JTextField(5);
		startDatumField = new JFormattedTextField(format);
		eindDatumField = new JFormattedTextField(format);
		opmerkingField = new JTextField(20);
		projectField = new JTextField(20);
		referentieField = new JTextField(10);
		periodiekeCheckBox = new JCheckBox("Periodieke factuur actief");
		emailCheckBox = new JCheckBox("Automatische emailing");
		saveButton = new JButton("Opslaan");
		previewButton = new JButton("Door naar factuur");
		resultArea = new JTextArea();
		resultArea.setEditable(false);

		// Voeg alle GUI-componenten toe aan het hoofdpaneel
		add(new JLabel("Relatie:"));
		add(relatieField);
		add(new JLabel("Factuuradres:"));
		add(adresField);
		add(new JLabel("Ter attentie van:"));
		add(attentieField);
		add(new JLabel("Werk omschrijving:"));
		add(opmerkingField);
		add(new JLabel("Betaaltermijn (dagen):"));
		add(termijnField);
		add(new JLabel("Bedrag (excl. btw):"));
		add(bedragExclField);
		add(new JLabel("Btw percentage:"));
		add(btwPercentageField);
		add(new JLabel("Start datum:"));
		add(startDatumField);
		add(new JLabel("Eind datum:"));
		add(eindDatumField);
		add(new JLabel("Gekoppeld project:"));
		add(projectField);
		add(new JLabel("Referentie:"));
		add(referentieField);
		add(periodiekeCheckBox);
		add(emailCheckBox);
		add(saveButton);
		add(previewButton);
		add(new JScrollPane(resultArea)); // Voeg een scrollpaneel toe voor de tekstgebied
	}

	public String getRelatie() {
		return relatieField.getText();
	}

	public String getFactuurAdres() {
		return adresField.getText();
	}

	public String getStartDatum() {
		return startDatumField.getText();
	}

	public String getEindDatum() {
		return eindDatumField.getText();
	}

	public String getTerAttentieVan() {
		return attentieField.getText();
	}

	public int getBetaalTermijn() {
		return Integer.parseInt(termijnField.getText());
	}

	public double getBedragExclBtw() {
		return Double.parseDouble(bedragExclField.getText());
	}

	public double getBtwPercentage() {
		return Double.parseDouble(btwPercentageField.getText());
	}

	public String getOpmerking() {
		return opmerkingField.getText();
	}

	public String getGekoppeldeProject() {
		return projectField.getText();
	}

	public String getReferentie() {
		return referentieField.getText();
	}

	public boolean isPeriodiekeFactuurActief() {
		return periodiekeCheckBox.isSelected();
	}

	public boolean isAutomatischeEmailing() {
		return emailCheckBox.isSelected();
	}

	public void addSaveButtonListener(ActionListener listener) {
		saveButton.addActionListener(listener);
	}

	public void addPreviewButtonListener(ActionListener listener) {
		previewButton.addActionListener(listener);
	}

	public void displayInvoiceSummary(String summary) {
		resultArea.setText(summary);
	}

	public void setBtwPercentage(double d) {
		btwPercentageField.setText(String.valueOf(d));
	}

	public void setRelatie(String string) {
		relatieField.setText(string);
	}

	public void setPeriodiekeFactuurActief(boolean b) {
		// TODO Auto-generated method stub
		periodiekeCheckBox.setSelected(b);
	}

	public void setAutomatischeEmailing(boolean b) {
		// TODO Auto-generated method stub
		emailCheckBox.setSelected(b);
	}
}