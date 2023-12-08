package com.Project.SpringAngular.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "customer_name",length = 50)
    private String customername;

    @Column(name = "customer_address",length = 60)
    private String customeraddress;

    @Column(name = "customer_mobile",length = 12)
    private int mobile;

    public Customer(String customerName, String customerAdress, int mobile) {
        this.customername = customerName;
        this.customeraddress = customerAdress;
        this.mobile = mobile;
    }
}
