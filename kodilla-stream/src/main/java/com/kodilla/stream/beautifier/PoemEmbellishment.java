package com.kodilla.stream.beautifier;

public class PoemEmbellishment {

    public static String ABCBeforeText(String text) {
        return "ABC" + text;
    }

    public static String ABCAfterText(String text) {
        return text + "ABC";
    }

    public static String textToUpperCase(String text) {
        return text.toUpperCase();
    }

    public static String textToLowerCase(String text) {
        return text.toLowerCase();
    }

    public static String replaceText(String text) {
        return text.replace("Ala", "Ola");
    }
}
