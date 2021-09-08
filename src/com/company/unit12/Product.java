package com.company.unit12;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Product  implements Serializable {
    private int id;
    private String name;
    private int price;
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public Product(int id, String name, int price, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }
}
