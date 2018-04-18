package com.example.sdu.lgssp;


import java.io.Serializable;

/**
 * 监督用户的bean
 */
public class OrderBean implements Serializable{
    public int id;
    public String name;
    public String description;
    public int iconId;

    public OrderBean(int id, String name, String description, int iconId){
        this.id = id;
        this.name = name;
        this.description = description;
        this.iconId = iconId;
    }
}
