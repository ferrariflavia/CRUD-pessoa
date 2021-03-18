package br.com.ferrariflavia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ferrariflavia.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
