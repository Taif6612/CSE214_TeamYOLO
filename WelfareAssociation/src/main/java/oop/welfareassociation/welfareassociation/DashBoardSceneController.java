package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;

public class DashBoardSceneController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    private void eventSafetyAndComplianceMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/eventSafetyAndComplianceScene.fxml", "Event Safety and Compliance");
    }

    @javafx.fxml.FXML
    private void eventPromotionMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/eventPromotionScene.fxml", "Event Promotion");
    }

    @javafx.fxml.FXML
    private void postEventEvalutionMouseOnClick(ActionEvent actionEvent) {
       loadScene ("view/postEventEvalutionScene.fxml"," Post Event Evalution");
    }

    @javafx.fxml.FXML
    private void eventLogisticsMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/eventLogisticsScene.fxml","Event Logistics");
    }

    @javafx.fxml.FXML
    private void eventBudgetMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/eventBudgetScene.fxml","Event Budget");
    }

    @javafx.fxml.FXML
    private void eventPlanningMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/eventPlanningScene.fxml","Event Planning") ;
    }

    @javafx.fxml.FXML
    private void eventRegistrationsMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/eventRegistrationsScene.fxml","Event Registrations") ;
    }

    @javafx.fxml.FXML
    private void stakeHolderCoordinationMouseOnClick(ActionEvent actionEvent) {
        loadScene("view/stakeHolderCoordinationScene.fxml","Stake Holder Coordination") ;
    }
    private void loadScene (String fxmiFile,String title) {

    }


}