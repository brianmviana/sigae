package dev.brianmviana.sigae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.brianmviana.sigae.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
