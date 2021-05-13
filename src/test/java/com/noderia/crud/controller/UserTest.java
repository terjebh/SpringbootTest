package com.noderia.crud.controller;

import com.noderia.crud.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void user() {
        Person olle = new Person("Olle",89);
        assertEquals(olle.getAlder(),89);
        assertEquals(olle.getNavn(),"Olle");

    }
}