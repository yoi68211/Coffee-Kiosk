module com.kgitbank.megakgcoffee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kgitbank.megakgcoffee to javafx.fxml;
    exports com.kgitbank.megakgcoffee;
}