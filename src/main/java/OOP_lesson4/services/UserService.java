package OOP_lesson4.services;

import OOP_lesson4.models.User;

import java.util.List;

public interface UserService<T extends User>{
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
    List<T> getAllSortByAge();
    int remove(String fullName);
    List<T> getAllByTitile(String groupTitle);
}