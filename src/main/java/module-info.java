module com.kgitbank.megakgcoffee {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires ojdbc8;


    opens com.kgitbank.megakgcoffee to javafx.fxml;
    exports com.kgitbank.megakgcoffee;

    opens com.kgitbank.megakgcoffee.Controller.Test to javafx.fxml;
    exports com.kgitbank.megakgcoffee.Controller.Test;

    exports com.kgitbank.megakgcoffee.Controller.HomeView;
    opens com.kgitbank.megakgcoffee.Controller.HomeView to javafx.fxml;
    exports com.kgitbank.megakgcoffee.Model.DAO.HomeView;
    opens com.kgitbank.megakgcoffee.Model.DAO.HomeView to javafx.fxml;
    exports com.kgitbank.megakgcoffee.Model.DTO.HomeView;
    opens com.kgitbank.megakgcoffee.Model.DTO.HomeView to javafx.fxml;
    exports com.kgitbank.megakgcoffee.Service.HomeView;
    opens com.kgitbank.megakgcoffee.Service.HomeView to javafx.fxml;
}