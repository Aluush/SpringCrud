package com.Project.SpringAngular.service;

import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomer(int id,CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
