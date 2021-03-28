package org.kurtlike;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import org.kurtlike.elements.charts.MyLineChart;

/**
 * @author kurtlike
 */

public class PrimaryController {
    @FXML
    private AnchorPane leTableauPrincipal;

    @FXML
    private Pane leTableauGrapheDeFonction;

    @FXML
    private Pane leTableauChoix;

    @FXML
    private ChoiceBox<?> methodeSelection;

    @FXML
    private ChoiceBox<?> lequationChoix;

    @FXML
    private TextField gaucheBordure;

    @FXML
    private TextField droiteBordure;

    @FXML
    private final TextField erreur = new TextField();

    @FXML
    private Button resoudreBouton;

    @FXML
    private final TextArea console = new TextArea();

    @FXML
    private MenuBar leMenu;

    @FXML
    public void initialize() {
        Double [][]arr = {{1.2,2.0},{1.3,2.2},{2.3,2.9}};
        MyLineChart<Double> myLineChart = new MyLineChart<>();
        myLineChart.addFunc(arr,"haha");
        myLineChart.insertChart(leTableauGrapheDeFonction);
        console.appendText("sadasd");
        erreur.setText("Asfdsa");
    }
}