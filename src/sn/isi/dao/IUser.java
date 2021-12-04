package sn.isi.dao;

import java.util.List;

import sn.isi.entities.User;

public interface IUser {
	public int add(User user);
    public int delete(int id) ;
    public int update(User user);
    public List<User> getAll();
    public User get(int id);
    public User login(String email, String password);
}
