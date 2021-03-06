package org.vaadin.exampleapp.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.exampleapp.data.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
