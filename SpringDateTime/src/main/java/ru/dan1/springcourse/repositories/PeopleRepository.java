package ru.dan1.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dan1.springcourse.models.Person;

/**
 * @author Danil Subachev
 */
@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
