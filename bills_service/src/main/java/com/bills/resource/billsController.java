package com.bills.resource;


import com.bills.model.bills;
import com.bills.repository.billsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class billsController {


    @Autowired
    private billsRepository repository;




    @PostMapping("/addbills")
    public String savebills(@RequestBody bills bills){
        repository.save(bills);
        return "Added bill with Bid : " + bills.getId();
    }
    @GetMapping("/findAllbills")
    public List<bills> getbills()
    {
        return repository.findAll();
    }

    @GetMapping("/findAllbills/{id}")
    public Optional<bills> getbills(@PathVariable int id)
    {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletebills(@PathVariable int id)
    {
        repository.deleteById(id);
        return "bills deleted by id : "+ id;
    }



}
