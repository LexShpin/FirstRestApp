package com.lexshpin.restApp.firstRestApp.repositories;

import com.lexshpin.restApp.firstRestApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
