package com.mokuai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;



}
