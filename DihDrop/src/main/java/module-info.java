module co.edu.uniquindio.poo.dihdrop {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.dihdrop to javafx.fxml;
    exports co.edu.uniquindio.poo.dihdrop;
}