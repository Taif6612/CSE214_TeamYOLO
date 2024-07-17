package oop.welfareassociation.welfareassociation;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class EventPlanningSceneController
{
    @javafx.fxml.FXML

    private DatePicker datePicker;

    @javafx.fxml.FXML

    private ComboBox<String> eventVenueComboBox;

    @javafx.fxml.FXML

    public void initialize() {
    }

    @javafx.fxml.FXML
    public void eventPlanningSaveButton(ActionEvent actionEvent) {
        LocalDate selectedDate = datePicker.getValue();
        String selectedVenue = eventVenueComboBox.getValue();
      //implement save logic
        System.out.println("Date selected: " + selectedDate);
        System.out.println("Venue selected:"+ selectedVenue);


    }

}