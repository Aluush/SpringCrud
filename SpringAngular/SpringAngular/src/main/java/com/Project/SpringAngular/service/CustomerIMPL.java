package com.Project.SpringAngular.service;

import com.Project.SpringAngular.CustomerRepo.CustomerRepo;
import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;
import com.Project.SpringAngular.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerIMPL implements CustomerService{


    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerAdress(),
                customerSaveDTO.getMobile()
                );
        customerRepo.save(customer);

        return customer.getCustomername();


    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList =  new ArrayList<>();
        for (Customer a:getCustomers){
            CustomerDTO customerDTO = new CustomerDTO(
                    a.getCustomerId(),
                    a.getCustomername(),
                    a.getCustomeraddress(),
                    a.getMobile()
            );

            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

    @Override
    public String updateCustomer(int id,CustomerUpdateDTO customerUpdateDTO) {

        if(customerRepo.existsById(id)){
            Customer customer = customerRepo.getById(id);

            customer.setCustomername(customerUpdateDTO.getCustomerName());
            customer.setCustomeraddress(customerUpdateDTO.getCustomerAdress());
            customer.setMobile(customerUpdateDTO.getMobile());
            customerRepo.save(customer);
        }
        else{
            System.out.println("Custom id do not exist");
        }
        return null;
    }

    @Override
    public boolean deleteCustomer(int id) {
        if(customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }
        else {
            System.out.println("customer doesnt exist");
        }
        return false;
    }


}
