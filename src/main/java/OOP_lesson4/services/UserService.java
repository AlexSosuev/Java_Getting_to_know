package OOP_lesson4.services;

import OOP_lesson4.models.User;

import java.util.List;

public interface UserService<T extends User>{
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    int remove(String fullName);
}