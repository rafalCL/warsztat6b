package pl.coderslab.warsztat6b.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.warsztat6b.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByEmail(String email);

}
