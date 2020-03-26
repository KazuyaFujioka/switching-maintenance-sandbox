package com.example.switching.maintenance._configuration.maintenance;

class MaintenancePath {

    String value;

    MaintenancePath(String value) {
        this.value = value;
    }

    boolean matching(String uri) {
        if(value.equals("/")) return value.equals(uri);
        return uri.contains(value);
    }
}
