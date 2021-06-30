package com.kodilla.stream.beautifier;

import com.kodilla.stream.lambda.MathExpression;

public class PoemBeautifier {

    public static void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("Result: " + result);
    }
}
