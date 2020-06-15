package com.hb.demo;

public class Profile {
    private final Integer id;
    private final String name;
    private final String paassword;

    public Profile(Integer id, String name, String paassword) {
        this.id = id;
        this.name = name;
        this.paassword = paassword;
    }

    public Integer getId() {
        return id;
    }

    public String getPaassword() {
        return paassword;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return paassword;
    }
}
