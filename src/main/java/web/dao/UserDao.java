package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    public void save(User user);

    public List<User> getAllUsers();

    public User findById(Long id);

    public void deleteUser(User user);

    public void editUser(User user);

}
