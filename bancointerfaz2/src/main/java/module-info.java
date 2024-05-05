module co.edu.uniquindio.poo {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo to javafx.fxml;
    exports co.edu.uniquindio.poo;

    opens co.edu.uniquindio.poo.controller to javafx.fxml;
    exports co.edu.uniquindio.poo.controller;
}
