module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens co.edu.uniquindio.poo to javafx.fxml, Controller;
    exports co.edu.uniquindio.poo;
    
 
}
