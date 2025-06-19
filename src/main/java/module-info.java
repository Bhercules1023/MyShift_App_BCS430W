module com.example.myshiftapp_new {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.myshiftapp_new to javafx.fxml;
    exports com.example.myshiftapp_new;
}
