package com.matsibora.test.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idCustomer;

    @Column(name = "code")
    private String codeCustomer;

    @Column(name = "name")
    private String nameCustomer;

    @Column(name = "address")
    private String addressCustomer;

    @Column(name = "discount")
    private Integer discountCustomer;

    public Customer() {
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Integer getDiscountCustomer() {
        return discountCustomer;
    }

    public void setDiscountCustomer(Integer discountCustomer) {
        this.discountCustomer = discountCustomer;
    }

    @OneToMany(mappedBy = "customerId")
    private Collection<Order> order;

    public Collection<Order> getOrder() {
        return order;
    }

    public void setOrder(Collection<Order> order) {
        this.order = order;
    }
}
