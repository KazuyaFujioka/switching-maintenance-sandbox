package com.example.switching.maintenance._configuration.maintenance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

enum MaintenancePage {

    index(new HashSet<>(Arrays.asList("/"))),
    something(new HashSet<>(Arrays.asList("something"))),
    anything(new HashSet<>(Arrays.asList("anything")));

    Set<MaintenancePath> paths;

    MaintenancePage(Set<String> paths) {
        this.paths = new HashSet<>();
        for(String path : paths) {
            this.paths.add(new MaintenancePath(path));
        }
    }

    static Set<MaintenancePath> list() {
        Set<MaintenancePath> list = new HashSet<>();
        list.addAll(something.paths);
        return list;
    }
}
