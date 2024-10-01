package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;

public class StudentsSceneController {

    private Model model = new Model();

    @FXML
    private Label colorLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void loadData(ActionEvent event) {

    }

    @FXML
    void changeColor(ActionEvent event) {
        if (colorLabel.getText().equals("Black"))
            colorLabel.setText("White");
        else colorLabel.setText("Black");
    }
}
