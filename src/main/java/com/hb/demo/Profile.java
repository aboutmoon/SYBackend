package com.hb.demo;

public class Profile {
    private final String name;
    private final String paassword;

    public Profile(String name, String paassword) {
        this.name = name;
        this.paassword = paassword;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return paassword;
    }
}
