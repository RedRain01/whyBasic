package model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Student {

    private int id;
    private String name;
    private  String type;
    private BigDecimal score;
}
