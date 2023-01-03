package com.skypro.izicook.service;

import com.skypro.izicook.model.Ingridient;


public interface IngridientServices {

    Ingridient addIngridient(Ingridient ingridient);

    Ingridient getIngridient(long id);
}
