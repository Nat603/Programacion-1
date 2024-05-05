module co.edu.uniquindio.poo {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens co.edu.uniquindio.poo to javafx.fxml, controller;
    exports co.edu.uniquindio.poo;
    
}
