module com.nxt.notes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.nxt.notes to javafx.fxml;
    exports com.nxt.notes;
    exports com.nxt.pojo;
}
