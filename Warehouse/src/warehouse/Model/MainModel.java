/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.Model;

import java.util.Date;

/**
 *
 * @author basazard
 */
public class MainModel {
    private String name;
    private String category;
    private Date income_date;
    private String stock;
    private String price;
    private String operator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getIncome_date() {
        return income_date;
    }

    public void setIncome_date(Date income_date) {
        this.income_date = income_date;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    
}
