package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemEmbellishment;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println();

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println();

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println();
        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(8, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(8, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(8, 4, FunctionalCalculator::SubBFromA);
        expressionExecutor.executeExpression(8, 4, FunctionalCalculator::multiplyAByB);

        System.out.println();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Beautifier with lambdas");
        poemBeautifier.beautify("Konrad", (text) -> ("ABC" + text));
        poemBeautifier.beautify("Konrad", (text) -> (text + "ABC"));
        poemBeautifier.beautify("Konrad", (text) -> (text.toUpperCase()));
        poemBeautifier.beautify("koNRaD", (text) -> (text.toLowerCase()));
        poemBeautifier.beautify("Ala ma kota", (text) -> (text.replace("Ala", "Ola")));

        System.out.println();
        System.out.println("Beautifier with method references");
        poemBeautifier.beautify("Konrad", PoemEmbellishment::ABCBeforeText);
        poemBeautifier.beautify("Konrad", PoemEmbellishment::ABCAfterText);
        poemBeautifier.beautify("Konrad", PoemEmbellishment::textToUpperCase);
        poemBeautifier.beautify("koNRaD", PoemEmbellishment::textToLowerCase);
        poemBeautifier.beautify("Ala ma kota", PoemEmbellishment::replaceText);
    }
}
