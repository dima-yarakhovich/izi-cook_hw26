package com.skypro.izicook.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingridient {
    private String name;
    private int count;
    private String measurement;
}
