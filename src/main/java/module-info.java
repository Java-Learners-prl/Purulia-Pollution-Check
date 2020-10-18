module com.srijan{
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;

    exports com.srijan.javafx.pollution;
    opens com.srijan.javafx.pollution to javafx.fxml;
}