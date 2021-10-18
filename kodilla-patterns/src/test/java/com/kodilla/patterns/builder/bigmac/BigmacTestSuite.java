package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.SESAME)
                .burgers(2)
                .sauce(Sauce.BARBEQUE)
                .ingredient(Ingredients.BECON)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.CHILLI)
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.ONION)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIngredients);
    }
}
