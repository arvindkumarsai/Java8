package com.karan.practice.practice.algorithems.asking;

import java.util.Objects;

public class User {

    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        return userName.equals(user.userName);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + userName.hashCode();
        return result;
    }
}
