package com.bills.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@ToString


@Document(collection = "bills")
public class bills {
    @Id

    private int id;

    private String name;
    private String date;
    private int amount;
    private String mode;




}
