package com.skypro.izicook.service;

import com.skypro.izicook.model.Ingridient;
import com.skypro.izicook.model.Recipte;

public interface RecipteServices {
    Recipte addRecipte(Recipte recipte);

    Recipte getRecipte(Long id);

}
