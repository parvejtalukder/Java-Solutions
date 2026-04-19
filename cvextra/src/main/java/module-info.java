module com.cv {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cv to javafx.fxml;
    exports com.cv;
}
