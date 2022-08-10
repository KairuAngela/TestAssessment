package com.fatma.wuhanproject_java.Database;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class UserViewModel extends AndroidViewModel {

    private UserRepository mRepository;
    private LiveData<List<User>> mAllUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);
        UserDao userDao = ProjectDatabase.getDatabase(application).userDao();
        mRepository = new UserRepository(userDao);
        mAllUsers = mRepository.readAllData();
    }

    public LiveData<List<User>> getAllEntries() {
        return mAllUsers;
    }

    public void addUser(User user) {
        mRepository.addUser(user);
    }

    public void updateUser(User user) {

    }

}
