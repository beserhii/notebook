package ua.training.model;

import ua.training.controller.Person;

public class Note {

    private String dateAddedPerson;
    private Person person;
    private String dateLastEdit;

    public Note(String dateAddedPerson, Person person, String dateLastEdit) {
        this.dateAddedPerson = dateAddedPerson;
        this.person = person;
        this.dateLastEdit = dateLastEdit;
    }

    public String getDateAddedPerson() {
        return dateAddedPerson;
    }

    public void setDateAddedPerson(String dateAddedPerson) {
        this.dateAddedPerson = dateAddedPerson;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDateLastEdit() {
        return dateLastEdit;
    }

    public void setDateLastEdit(String dateLastEdit) {
        this.dateLastEdit = dateLastEdit;
    }

    @Override
    public String toString() {
        return "Note{" +
                "dateAddedPerson='" + dateAddedPerson + '\'' +
                ", person=" + person +
                ", dateLastEdit='" + dateLastEdit + '\'' +
                '}';
    }
}
