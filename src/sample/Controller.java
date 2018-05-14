package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Button button1;
    public Label label1;
    public Label label2;
    public RadioButton easy;
    public RadioButton medium;
    public RadioButton hard;
    @FXML
    public void handleButton1OnClick(ActionEvent actionEvent) throws IOException {
        System.out.println("Button clicked!");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample1.fxml"));
        Parent root = (Parent) loader.load();
        Controller1 controller1 = loader.getController();
        controller1.setLabel(label1.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data....");

    }

}
