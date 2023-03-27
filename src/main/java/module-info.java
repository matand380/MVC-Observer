module com.example.mvcobserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mvcobserver to javafx.fxml;
    exports com.example.mvcobserver;
}