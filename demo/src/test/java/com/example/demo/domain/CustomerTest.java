package com.example.demo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void getNameTest() {
        // Arrange
        Customer customer = new Customer("Test Name");

        // Act
        String name = customer.getName();

        // Assert
        Assertions.assertEquals("Test Name", name);

    }
}