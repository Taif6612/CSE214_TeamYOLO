module oop.welfareassociation.welfareassociation {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.welfareassociation.welfareassociation to javafx.fxml;
    exports oop.welfareassociation.welfareassociation;
}