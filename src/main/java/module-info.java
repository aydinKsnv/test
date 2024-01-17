module com.example.students {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.students to javafx.fxml;
    exports com.example.students;
    exports com.example.students.models;
    opens com.example.students.models to javafx.fxml;
}