package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;

public class DashBoardSceneController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void eventSafetyAndComplianceMouseOnClick(ActionEvent actionEvent) {

        loadScene("eventSafety.fxml");

    }

    @javafx.fxml.FXML
    public void eventPromotionMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventSafety.fxml");

    }

    @javafx.fxml.FXML
    public void postEventEvalutionMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventSafety.fxml");
    }

    @javafx.fxml.FXML
    public void eventLogisticsMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventLogisticsScene.fxml");

    }

    @javafx.fxml.FXML
    public void eventBudgetMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventSafety.fxml");

    }

    @javafx.fxml.FXML
    public void eventPlanningMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventPlanningScene.fxml");

    }

    @javafx.fxml.FXML
    public void eventRegistrationsMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventSafety.fxml");

    }

    @javafx.fxml.FXML
    public void stakeHolderCoordinationMouseOnClick(ActionEvent actionEvent) {
        loadScene("eventSafety.fxml");

    }


}