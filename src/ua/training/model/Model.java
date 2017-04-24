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

    public int findPerson(Person person) {
        int indexPerson=-1;
        for (int i = 0; i < this.notebook.size(); i++) {
            if (this.notebook.get(i).equals(person)) {
                indexPerson=i;
            }
        }
        return indexPerson;
    }

    public void addNote(String currentDate, Person person) {
        int indexPerson=findPerson(person);
        if (indexPerson>=0){
            this.notebook.get(indexPerson).setDateLastEdit(currentDate);
        }
        else{
            this.notebook.add(new Note(currentDate,person,currentDate));
        }
    }

    public void printAll(){
        for (Note note : notebook) {
            System.out.println(note.toString());
        }
    }


}
