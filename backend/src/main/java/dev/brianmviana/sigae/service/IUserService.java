package dev.brianmviana.sigae.service;

import java.util.List;

import dev.brianmviana.sigae.model.User;

public interface IUserService {

	public User save(User user);

	public List<User> findAll();

	public User findOne(long id);

	public User update(User user);
	
	public User findByLogin(String login);

	public void delete(long id);
}
