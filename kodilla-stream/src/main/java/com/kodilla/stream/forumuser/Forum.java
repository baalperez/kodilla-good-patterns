package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "Johnny1985", 'M', 1985, 04, 20, 16));
        theForumUsersList.add(new ForumUser(2, "Pablo1992", 'M', 1992, 04, 20, 12));
        theForumUsersList.add(new ForumUser(3, "Missy2014", 'F', 2014, 04, 20, 0));
        theForumUsersList.add(new ForumUser(4, "Kate2002", 'F', 2002, 04, 20, 2));
        theForumUsersList.add(new ForumUser(5, "Anthony1990", 'M', 1990, 04, 20, 15));
        theForumUsersList.add(new ForumUser(6, "Jessie1975", 'M', 1975, 04, 20, 10));
        theForumUsersList.add(new ForumUser(7, "Brian2005", 'M', 2005, 04, 20, 0));
        theForumUsersList.add(new ForumUser(8, "Helmut1956", 'M', 1956, 04, 20, 1));
        theForumUsersList.add(new ForumUser(9, "Helga1960", 'F', 1960, 04, 20, 0));
        theForumUsersList.add(new ForumUser(10, "Chris2010", 'M', 2010, 04, 20, 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
