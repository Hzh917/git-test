package com.design.openclose;

public class Java implements ICourse {

    private Integer Id;
    private String Name;
    private Double Price;

    public Java(Integer id, String name, Double price) {
        this.Id = id;
        this.Name = name;
        this.Price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Double getPrice() {
        return this.Price;
    }
}
