module org.example.bagels {
    requires javafx.controls;
    requires javafx.fxml;


//    opens org.example to javafx.fxml;
//    exports org.example;
    exports org.example.bagels1;
    opens org.example.bagels1 to javafx.fxml;
//    exports org.example;
//    opens org.example to javafx.fxml;
}