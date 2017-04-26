package ua.training.model;

import ua.training.controller.InputException;
import ua.training.controller.Person;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Person> notebook;
    public Model() {
        this.notebook = new ArrayList<>();
    }
    public List<Person> getNote() {
        return notebook;
    }

    //Search in the book. If not then add.
    public boolean findNickname(Person person) throws InputException{

        for (int i = 0; i < this.notebook.size(); i++) {
            if (this.notebook.get(i).getNickName().equals(person.getNickName())) {
                throw new InputException("WRONG INPUT DATA");
            }
        }
        return true;
    }

    // Add to notebook entity(Note{createDate, Person, editDate})
    public void addNote (Person person) throws InputException{

        if(findNickname(person)){
            this.notebook.add(person);
        }
    }

    @Override
    public String toString() {
        return "Model{" +
                "notebook=" + notebook +
                '}';
    }
}
