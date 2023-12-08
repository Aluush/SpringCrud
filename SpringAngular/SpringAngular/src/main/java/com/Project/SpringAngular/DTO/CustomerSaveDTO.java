package com.Project.SpringAngular.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSaveDTO {

    private String customerName;
    private String customerAdress;
    private int mobile;


}
