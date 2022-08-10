package com.fatma.wuhanproject_java.Database;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addUser(User user);

    @Update
    void updateUser(User entry);

    @Query("SELECT * FROM user_table ORDER BY user_id ASC")
    LiveData<List<User>> readAllData();

  //  @Query("INSERT INTO user_table ([firstname, lastname, phone, age, id, email])" VALUES " +
    //        "(fname, lastname, phone, age, id, email)")

//    @Query("Select * FROM user_table where firstName = (:firstName) and lastName = (:password) ")
//    void loginUser(String firstName, String password);

    @Query("DELETE FROM user_table")
    void deleteAllEntries();

}
