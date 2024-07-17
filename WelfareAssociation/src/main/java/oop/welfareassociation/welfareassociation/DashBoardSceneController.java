package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;

public class DashBoardSceneController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void eventSafetyAndComplianceMouseOnClick(ActionEvent actionEvent) {
        // Code to nevigate to the Safety and Compliance Screen
        System.out.println("Navigating to Event Safety and Compliance");
    }

    @javafx.fxml.FXML
    public void eventPromotionMouseOnClick(ActionEvent actionEvent) {
        System.out.println("Navigating to Event Promotion");
    }

    @javafx.fxml.FXML
    public void postEventEvalutionMouseOnClick(ActionEvent actionEvent) {
        System.out.println("Navigating to Post Event Evalution");
    }

    @javafx.fxml.FXML
    public void eventLogisticsMouseOnClick(ActionEvent actionEvent) {
        System.out.println("Navigating to eventLogistics");
    }

    @javafx.fxml.FXML
    public void eventBudgetMouseOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eventPlanningMouseOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eventRegistrationsMouseOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void stakeHolderCoordinationMouseOnClick(ActionEvent actionEvent) {
    }
}