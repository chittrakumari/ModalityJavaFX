module com.example.lifecycleofjavafxapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lifecycleofjavafxapplication to javafx.fxml;
    exports com.example.lifecycleofjavafxapplication;
}