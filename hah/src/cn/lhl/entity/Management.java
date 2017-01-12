package cn.lhl.entity;

import java.util.Date;

/**
 * Created by datou on 2017/1/10.
 */
public class Management {
    private Integer Serialnum;
    private String model;
    private double price;
    private Date date1;

    public Integer getSerialnum() {
        return Serialnum;
    }

    public void setSerialnum(Integer serialnum) {
        Serialnum = serialnum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date) {
        this.date1 = date;
    }
}
