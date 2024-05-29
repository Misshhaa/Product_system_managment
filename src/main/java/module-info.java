module main.product_system_managment {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens main.product_system_managment to javafx.fxml;
    exports main.product_system_managment;
}