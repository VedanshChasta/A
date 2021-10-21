module com.example.hackathon {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires opencv;
    requires javacv;


    opens com.example.hackathon to javafx.fxml;
    exports com.example.hackathon;
}