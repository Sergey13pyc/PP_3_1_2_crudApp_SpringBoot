package ru.aretomov.myspringbootdapp.PP_3_1_2_crudApp.dao;


import ru.aretomov.myspringbootdapp.PP_3_1_2_crudApp.model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user); //запрос update
    List<User> getAllUsers(); // запрос select
    User getUserById (long id);

    void delete(long id); //запрос delete
    void updateUser (long id, User userForUpdate);
}
