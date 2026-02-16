module com.example.appmodule {
    requires java.logging;
    requires java.sql;
    requires java.xml;

    exports com.example.app;
    exports com.example.anotherapp;
}

