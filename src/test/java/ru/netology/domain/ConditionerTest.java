package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseFromMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseFromMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(-10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-10, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseFromMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseFromMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseFromLowerThanMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseFromLowerThanMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(9, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseFromOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(50);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }
}