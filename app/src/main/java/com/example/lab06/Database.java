package com.example.lab06.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.lab06.dao.PersonDao;
import com.example.lab06.entity.Person;

@Database(entities = {Person.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract PersonDao personDao();
}