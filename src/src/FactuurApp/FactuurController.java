package src.FactuurApp;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FactuurController {
    private FactuurModel model;
    private FactuurView view;

    public FactuurController(FactuurModel model, FactuurView view) {
        this.model = model;
        this.view = view;

        view.addSaveButtonListener(new SaveButtonListener());
        view.addPreviewButtonListener(new PreviewButtonListener());
    }

    class SaveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	// Zorg ervoor dat btwPercentage is ingesteld
            model.setBtwPercentage(view.getBtwPercentage()); 
            // Haal gegevens op van de view en update het model
            updateModelFromView();
            // Toon de factuurgegevens in de view
            view.displayInvoiceSummary(model.getInvoiceSummary());
        }
    }

    class PreviewButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	// Zorg ervoor dat btwPercentage is ingesteld
            model.setBtwPercentage(view.getBtwPercentage());
        	// Haal gegevens op van de view en update het model
            updateModelFromView();
            // Toon de factuurgegevens in een nieuw venster
            displayInvoiceDetails();
        }
    }

    private void updateModelFromView() {
        model.setRelatie(view.getRelatie());
        model.setFactuurAdres(view.getFactuurAdres());
        model.setTerAttentieVan(view.getTerAttentieVan());
        model.setBetaalTermijn(view.getBetaalTermijn());
        model.setBedragExclBtw(view.getBedragExclBtw());
        model.setBtwPercentage(view.getBtwPercentage());
        model.setStartDatum(view.getStartDatum());
        model.setEindDatum(view.getEindDatum());
        model.setOpmerking(view.getOpmerking());
        model.setGekoppeldeProject(view.getGekoppeldeProject());
        model.setReferentie(view.getReferentie());
        model.setPeriodiekeFactuurActief(view.isPeriodiekeFactuurActief());
        model.setAutomatischeEmailing(view.isAutomatischeEmailing());
    }

    private void displayInvoiceDetails() {
        // Factuurdetails ophalen uit het model
        String relatie = model.getRelatie();
        // Andere factuurgegevens ophalen

        // Factuurdetails weergeven in een nieuw venster
        JFrame detailsFrame = new JFrame("Factuur Details");
        JPanel detailsPanel = new JPanel(new GridLayout(0, 1));

        // Labels om factuurgegevens weer te geven
        JLabel relatieLabel = new JLabel("Relatie: " + relatie);
        // Andere labels voor factuurgegevens

        // Labels toevoegen aan het paneel
        detailsPanel.add(relatieLabel);
        // Andere labels toevoegen

        // Knop om terug te keren naar het hoofdvenster
        JButton backButton = new JButton("Terug");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                detailsFrame.dispose(); // Sluit het details venster
            }
        });
    }
}