package com.vlad.junit.dao;

import org.mockito.stubbing.Answer;

import java.util.HashMap;
import java.util.Map;

public class UserDaoMock extends UserDao{

    private Map<Integer, Boolean> answers = new HashMap<>();
//    private Answer<Integer, Boolean> answer;

    @Override
    public boolean delete(Integer userId) {
        return answers.getOrDefault(userId, false);
    }
}
