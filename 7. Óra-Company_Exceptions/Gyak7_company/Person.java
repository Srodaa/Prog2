package org.example;

import java.time.LocalDate;

public class Person {
    private String name, nickname;
    private LocalDate birthdate;

    public Person(String name, String nickname, LocalDate birthdate) throws WrongBirthDateException {
        this(name, birthdate);
        this.nickname = nickname;

    }

    public Person(String name, LocalDate birthdate) throws WrongBirthDateException{
        this.name = name;
        int age=LocalDate.now().getYear()-birthdate.getYear();
        if (age < 18 || age > 65)
            throw new WrongBirthDateException("A megadott személy nem dolgozhat!");
        this.birthdate=birthdate;
    }

    public String getName() {
        return name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", birthdate=").append(birthdate);
        sb.append('}');
        return sb.toString();
    }
}
