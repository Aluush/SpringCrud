package com.Project.SpringAngular.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAdress;
    private int mobile;

    @Override
    public String toString() {
        return "customerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAdress='" + customerAdress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
