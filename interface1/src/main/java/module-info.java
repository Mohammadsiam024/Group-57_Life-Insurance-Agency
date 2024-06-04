module policyholder.interface1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens policyholder.interface1 to javafx.fxml;
    exports policyholder.interface1;
}