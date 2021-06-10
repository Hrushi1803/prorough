package com.bills.repository;

import com.bills.model.bills;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface billsRepository extends MongoRepository <bills,Integer>{







}
