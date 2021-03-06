/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MarleyWins
 */
public class DialogNewShopController implements Initializable {

    Stage stage;
    List<TextField> fields;

    @FXML
    private VBox mainBox;
    @FXML
    private GridPane formGrid;
    @FXML
    private Label labelName;
    @FXML
    private Label labelName1;
    @FXML
    private TextField nameField;
    @FXML
    private Label labelUlice;
    @FXML
    private Label labelCisloPopisne;
    @FXML
    private Label labelMesto;
    @FXML
    private Label labelPSC;
    @FXML
    private TextField uliceField;
    @FXML
    private TextField cisloPopisneField;
    @FXML
    private TextField mestoField;
    @FXML
    private TextField pscField;
    @FXML
    private HBox buttonBox;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;

    public VBox getMainBox() {
        return mainBox;
    }

    public GridPane getFormGrid() {
        return formGrid;
    }

    public Label getLabelName() {
        return labelName;
    }

    public Label getLabelName1() {
        return labelName1;
    }

    public TextField getNameField() {
        return nameField;
    }

    public Label getLabelUlice() {
        return labelUlice;
    }

    public Label getLabelCisloPopisne() {
        return labelCisloPopisne;
    }

    public Label getLabelMesto() {
        return labelMesto;
    }

    public Label getLabelPSC() {
        return labelPSC;
    }

    public TextField getUliceField() {
        return uliceField;
    }

    public TextField getCisloPopisneField() {
        return cisloPopisneField;
    }

    public TextField getMestoField() {
        return mestoField;
    }

    public TextField getPscField() {
        return pscField;
    }

    public HBox getButtonBox() {
        return buttonBox;
    }

    public Button getOkButton() {
        return okButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void init(Stage stage) {
        this.stage = stage;
        cancelButton.setOnAction((ActionEvent event) -> {
            stage.close();
        });

        okButton.setOnAction((ActionEvent event) -> {
            System.out.print("Clicked");
            checkValues();
            createRecord();
        });

        fields = new ArrayList<>();
        fields.add(nameField);
        fields.add(pscField);
        fields.add(uliceField);
        fields.add(mestoField);
        fields.add(cisloPopisneField);
    }

    public void checkValues() {
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Chyba");
                alert.setHeaderText("Záznam nelze uložit.");
                alert.setContentText("Nevyplnili jste všechna pole.");
                alert.showAndWait();
                break;
            }
        }
    }
    
    public void createRecord(){
        
    }
}
