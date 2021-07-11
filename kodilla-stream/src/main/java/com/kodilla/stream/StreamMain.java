package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        People.getList().stream()
                .forEach(System.out::println);

        System.out.println();
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println();
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        System.out.println();
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println();
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println();
        BookDirectory bookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());
        System.out.println("\"# elements: \" + theResultListOfBooks.size()");
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println();
        BookDirectory bookDirectory1 = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = bookDirectory1.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("\"# elements: \" + theResultListOfBooks.size()");
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();
        BookDirectory theBookDirectory2 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(theResultStringOfBooks);

        System.out.println();


        // Rozwiązanie zadania: funkcyjny spacer po liście użytkowników forum
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(sex -> sex.getSex() == 'M')
                .filter(age -> age.getBirthDate().getYear() <= 2001)
                .filter(posts -> posts.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forum -> forum));
        System.out.println("The result map has " + theResultMapOfForumUsers.size() + " element(s)");
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

