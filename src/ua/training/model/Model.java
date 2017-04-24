package ua.training.model;

import ua.training.controller.Person;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Note> notebook;

    public Model() {
        this.notebook = new ArrayList<>();
    }

    public List<Note> getNote() {
        return notebook;
    }

    //Search in the book. If not then add.
    public int findPerson(Person person) {
        int indexPerson=-1;
        for (int i = 0; i < this.notebook.size(); i++) {
            if (this.notebook.get(i).equals(person)) {
                indexPerson=i;
            }
        }
        return indexPerson;
    }

    // Add to notebook entity(Note{createDate, Person, editDate})
    public void addNote(String currentDate, Person person) {
        int indexPerson=findPerson(person);
        if (indexPerson>=0){
            this.notebook.get(indexPerson).setDateLastEdit(currentDate);
        }
        else{
            this.notebook.add(new Note(currentDate,person,currentDate));
        }
    }

    @Override
    public String toString() {
        return "Model{" +
                "notebook=" + notebook +
                '}';
    }
}
