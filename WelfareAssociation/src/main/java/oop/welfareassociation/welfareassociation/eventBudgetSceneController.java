package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import static javafx.collections.FXCollections.observableArrayList;

public class eventBudgetSceneController {
    @javafx.fxml.FXML
    private TableColumn<Expense, String> budgetCategoryColumn;
    @javafx.fxml.FXML
    private TextField budgetCategoryTextField;
    @javafx.fxml.FXML
    private TableView<Expense> expenseTableView;
    @javafx.fxml.FXML
    private TableColumn<Expense, Double> budgetAmountColumn;
    @javafx.fxml.FXML
    private TextField budgetAmountTextField;

    @javafx.fxml.FXML
    public void initialize() {
        //


    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
        //

    }
}