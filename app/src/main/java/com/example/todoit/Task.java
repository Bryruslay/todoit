package com.example.todoit;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tasks")
public class Task {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;
    public boolean completed;

    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }
}
