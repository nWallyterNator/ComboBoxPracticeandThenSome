module com.example.comboboxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comboboxpractice to javafx.fxml;
    exports com.example.comboboxpractice;
}