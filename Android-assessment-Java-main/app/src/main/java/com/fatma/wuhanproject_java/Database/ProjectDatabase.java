package com.fatma.wuhanproject_java.Database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class}, version = 3, exportSchema = false)
public abstract class ProjectDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    private static volatile ProjectDatabase INSTANCE;

    static ProjectDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ProjectDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ProjectDatabase.class, "user_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
