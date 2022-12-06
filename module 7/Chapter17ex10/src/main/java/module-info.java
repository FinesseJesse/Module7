module com.mycompany.chapter17ex10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.chapter17ex10 to javafx.fxml;
    exports com.mycompany.chapter17ex10;
}
