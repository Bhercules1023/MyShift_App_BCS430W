module com.example.myshiftapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myshiftapplication to javafx.fxml;
    exports com.example.myshiftapplication;
}