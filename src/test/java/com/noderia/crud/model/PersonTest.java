package com.noderia.crud.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person olle = new Person("Olle",89);

    @Test
    void getNavn() {
        assertEquals(olle.getNavn(),"Olle");
    }

    @Test
    void setNavn() {
        olle.setNavn("Eva");
        assertEquals(olle.getNavn(),"Eva");
    }

    @Test
    void getAlder() {
        assertEquals(olle.getAlder(),89);
    }

    @Test
    void setAlder() {
        olle.setAlder(100);
        assertEquals(olle.getAlder(),100);

    }
}