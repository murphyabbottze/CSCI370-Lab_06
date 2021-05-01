package com.example.lab06.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.lab06.entity.Person;

import java.util.List;

@Dao
public interface PersonDaoActivity {
    @Insert
    void insertPerson(Person person);

    @Query("SELECT * FROM Person")
    List<Person> getAllPersons();
}