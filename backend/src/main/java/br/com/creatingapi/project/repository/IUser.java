package br.com.creatingapi.project.repository;

import br.com.creatingapi.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Integer> {
}
