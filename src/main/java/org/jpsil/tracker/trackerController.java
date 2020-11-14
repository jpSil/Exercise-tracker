package org.jpsil.tracker;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import org.jpsil.tracker.graphs.Pchart;

public class trackerController {

    // Database manager
    private DatabaseManager dbManager = new DatabaseManager();

    // Main container
    @FXML
    private BorderPane mainContainer;

    // Graph container
    @FXML
    private Pane graphContainer;

    // DatePicker in add exercises pane
    @FXML
    private DatePicker addExerciseDatePicker;

    // Button in add exercises pane
    @FXML
    private Button addExerciseButton;

    // TextField in add exercises pane
    @FXML
    private TextField addExerciseDurationField;

    // ChoiceBox in add exercises pane
    @FXML
    private ChoiceBox<String> addExerciseChoiceBox;

    // DatePicker in retrieve exercises pane
    @FXML
    private DatePicker retrieveExercisesBeginDate;

    // DatePicker in retrieve exercises pane
    @FXML
    private DatePicker retrieveExercisesEndDate;

    // ChoiceBox in retrieve exercises pane
    @FXML
    private ChoiceBox<String> retrieveExercisesChoiceBox;

    // Button in retrieve exercises pane
    @FXML
    private Button retrieveExercisesButton;

    // Pie chart
    private Pchart pChart;


}
