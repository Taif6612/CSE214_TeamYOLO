package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class eventLogisticsSceneController
{
    @javafx.fxml.FXML
    private TextField vendorListTextField;
    @javafx.fxml.FXML
    private TextField equipmentListTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void contactVendorsButtonOnMouseClick(ActionEvent actionEvent) {
        //Implement Contact Vendors functionality
        String vendorList = vendorListTextField.getText();
        String eqiupmentList = equipmentListTextField.getText();
        System.out.println("Contacting Vendors: " + vendorList +" for equipments: " + eqiupmentList);
    }

    @javafx.fxml.FXML
    public void confirmServicesButtonOnMouseClick(ActionEvent actionEvent) {
        // Implement confirm services functionality
        String vendorList = vendorListTextField.getText();
        String equipmentList = equipmentListTextField.getText();
        System.out.println("Confirming Services for vendors: " + vendorList +" with equipments: " + equipmentList);
    }
}