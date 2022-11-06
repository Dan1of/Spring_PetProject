package ru.dan1.springcourse.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dan1.springcourse.FirstSecurityApp.models.Person;

import java.util.Optional;

/**
 * @author Danil Subachev
 */
@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
