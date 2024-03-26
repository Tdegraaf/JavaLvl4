package src.FactuurApp;

import javax.swing.*;

public class FactuurRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        FactuurModel model = new FactuurModel();
        FactuurView view = new FactuurView();
        FactuurController controller = new FactuurController(model, view);

        JFrame frame = new JFrame("Factuur Applicatie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(view);
        frame.pack();
        frame.setLocationRelativeTo(null); // Zet het venster in het midden van het scherm
        frame.setVisible(true);
    }
}