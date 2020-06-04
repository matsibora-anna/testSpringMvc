package com.matsibora.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idItem;

    @Column(name = "code")
    private String codeItem;

    @Column(name = "name")
    private String nameItem;

    @Column(name = "price")
    private Double priceItem;

    @Column(name = "category")
    private String categoryItem;

    @Column(name = "number")
    private Integer numberItem;

    @Column(name = "disable")
    private boolean disableItem = false;

    public Integer getNumberItem() {
        return numberItem;
    }

    public void setNumberItem(Integer numberItem) {
        this.numberItem = numberItem;
    }

    public Item() {
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(String codeItem) {
        this.codeItem = codeItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public Double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(Double priceItem) {
        this.priceItem = priceItem;
    }

    public String getCategoryItem() {
        return categoryItem;
    }

    public void setCategoryItem(String categoryItem) {
        this.categoryItem = categoryItem;
    }

    public boolean getDisableItem() {
        return disableItem;
    }

    public void setDisableItem(boolean disableItem) {
        this.disableItem = disableItem;
    }
}
