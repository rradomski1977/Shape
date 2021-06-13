package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Mariusz Nowak", 'M',
                LocalDate.of(1982, 2, 12), 0));
        theForumUserList.add(new ForumUser(2, "Iwona Marczyk", 'F',
                LocalDate.of(1990, 5, 7), 43));
        theForumUserList.add(new ForumUser(3, "Janusz Sekielski", 'M',
                LocalDate.of(2002, 4, 27), 24));
        theForumUserList.add(new ForumUser(4, "Justyna Krupa", 'F',
                LocalDate.of(1990, 5, 29), 0));
        theForumUserList.add(new ForumUser(5, "Grzegorz Zięcina", 'M',
                LocalDate.of(1993, 11, 15), 7));
        theForumUserList.add(new ForumUser(6, "Monika Duda", 'F',
                LocalDate.of(2003, 12, 22), 19));
        theForumUserList.add(new ForumUser(7, "Jerzy Grubba", 'M',
                LocalDate.of(1999, 7, 14), 55));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}