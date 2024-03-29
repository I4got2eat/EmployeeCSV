package com.sorcery.registry.service;

import com.sorcery.registry.model.Person;
import com.sorcery.registry.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class PersonService {
    private final PersonRepository repository;
    public void addPerson(Person person){
        person = person.toBuilder().id(UUID.randomUUID()).build();
        repository.insertPerson(person);
    }
    public List<Person> getPeople()
    {
        return repository.getPeople();
    }
    public void deletePeople(){
        repository.deleteAllPeople();
    }

}
