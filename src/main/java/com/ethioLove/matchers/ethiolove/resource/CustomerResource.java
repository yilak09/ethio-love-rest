package com.ethioLove.matchers.ethiolove.resource;

import com.ethioLove.matchers.ethiolove.models.Customers;
import com.ethioLove.matchers.ethiolove.repository.MatchersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerResource {
    @Autowired
    MatchersRepository matchersRepository;
    @GetMapping(value="/all")
    public List<Customers> getAllCustomers(){
        return matchersRepository.findAll();
    }
    @PostMapping(value="/add")
    public void addCustomer(@RequestBody final Customers customer){
        if(!matchersRepository.findAll().stream().filter(a->customer.getName().equals(a.getName())).findAny().isPresent()){
            matchersRepository.save(customer);
        }

    }

}

