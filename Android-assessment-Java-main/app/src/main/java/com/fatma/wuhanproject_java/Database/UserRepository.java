package com.fatma.wuhanproject_java.Database;


import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;

public class UserRepository {

    private UserDao mUserDao;

    UserRepository(UserDao dao) {
        mUserDao = dao;
    }

    LiveData<List<User>> readAllData() {
        return mUserDao.readAllData();
    }

    void addUser(final User user) {
        mUserDao.addUser(user);
    }


}