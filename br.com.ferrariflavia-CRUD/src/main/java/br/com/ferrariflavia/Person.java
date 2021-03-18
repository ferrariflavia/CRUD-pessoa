package br.com.ferrariflavia;

import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    public Person() {

    }

    public Person(String name, String age) {
        super();
        this.name = name;
        this.age = age;

    }
    public Long getId(){
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(String age){
        this.age = age;
    }

    public String toString() {
        return toString();
    }


}