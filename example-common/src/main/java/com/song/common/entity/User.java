package com.song.common.entity;

import java.io.Serializable;

public class User implements Serializable {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
