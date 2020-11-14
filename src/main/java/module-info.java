module org.jpsil.tracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.jpsil.tracker to javafx.fxml;
    exports org.jpsil.tracker;
}