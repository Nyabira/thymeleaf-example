package com.zalego.io.demo.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="location")
public class Location extends BaseEntity{
    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
