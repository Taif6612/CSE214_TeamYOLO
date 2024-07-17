package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import static javafx.collections.FXCollections.observableArrayList;

public class eventBudgetSceneController
{
    @javafx.fxml.FXML
    private TableColumn <Expense, String>budgetCategoryColumn;
    @javafx.fxml.FXML
    private TextField budgetCategoryTextField;
    @javafx.fxml.FXML
    private TableView<Expense> expenseTableView;
    @javafx.fxml.FXML
    private TableColumn <Expense, Double>budgetAmountColumn;
    @javafx.fxml.FXML
    private TextField budgetAmountTextField;

    @javafx.fxml.FXML
    public void initialize() {
        expenses =observableArrayList();
        budgetAmountColumn.setCellFactory();
        budgetCategoryColumn.setCellFactory();


    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
        String category = budgetCategoryTextField.getText();
        Double amount = Double.parseDouble(budgetAmountTextField.getText());

        Expense expense = new Expense(category, amount);
        Expense.add(expense);


}