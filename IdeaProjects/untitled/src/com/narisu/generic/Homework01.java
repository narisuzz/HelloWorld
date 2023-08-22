package com.narisu.generic;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void TestList() {
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        dao.save("003",new User(3,32,"milan"));
        List<User> list = dao.list();
        System.out.println("list=" + list);
    }
}

