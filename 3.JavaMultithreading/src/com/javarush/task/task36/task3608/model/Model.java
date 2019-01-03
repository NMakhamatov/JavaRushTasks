package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

public interface Model{
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    public void loadUserById(long userId);
    public void deleteUserById(long id);
    void changeUserData(String name, long id, int level);
}
