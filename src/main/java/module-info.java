module com.kgitbank.megakgcoffee {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires ojdbc8;


    opens com.kgitbank.megakgcoffee to javafx.fxml;
    opens com.kgitbank.megakgcoffee.Controller.Test to javafx.fxml;
    opens com.kgitbank.megakgcoffee.Controller.HomeView to javafx.fxml;
    exports com.kgitbank.megakgcoffee;
    exports com.kgitbank.megakgcoffee.HomeView;

    opens com.kgitbank.megakgcoffee.HomeView to javafx.fxml;
}