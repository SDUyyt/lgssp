package com.example.sdu.lgssp.bean;

import java.io.Serializable;

/**
 * 订单的bean
 */
public class OrderBean implements Serializable {
    public int id;
    public String name;
    public String description;
    public String type;
    public String price;
    public String status;

    public OrderBean(int id, String name, String description, String type, String price, String status){
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.status = status;
    }
}