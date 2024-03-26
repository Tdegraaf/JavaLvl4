package src.FactuurApp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

class FactuurControllerTest {


    private FactuurController controller;
    private FactuurModel model;
    private FactuurView view;

    @Before
    public void setUp() {
        model = new FactuurModel();
        view = new FactuurView();
        controller = new FactuurController(model, view);
    }

    @Test
    public void testSaveButtonListener() {
        // Set up view with sample data
        view.setBtwPercentage(21.0);
        view.setRelatie("Company ABC");
        // Set up other view fields...

        // Trigger action
        controller.new SaveButtonListener().actionPerformed(null);

        // Check if model fields are correctly updated
        assertEquals(21.0, model.getBtwPercentage(), 0.01);
        assertEquals("Company ABC", model.getRelatie());
    }

    @Test
    public void testPreviewButtonListener() {
        // Set up view with sample data
        view.setBtwPercentage(21.0);
        view.setRelatie("Company XYZ");
        // Set up other view fields...

        // Trigger action
        controller.new PreviewButtonListener().actionPerformed(null);

        // Check if model fields are correctly updated
        assertEquals(21.0, model.getBtwPercentage(), 0.01);
        assertEquals("Company XYZ", model.getRelatie());
        // Check other model fields...
    }

}
