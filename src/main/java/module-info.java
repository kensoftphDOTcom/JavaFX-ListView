module com.example.listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.listview to javafx.fxml;
    exports com.kensoftph.listview;
}