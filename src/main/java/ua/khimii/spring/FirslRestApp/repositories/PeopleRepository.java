package ua.khimii.spring.FirslRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.khimii.spring.FirslRestApp.models.Person;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
