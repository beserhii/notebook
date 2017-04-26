package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser() throws InputException {
        InputNoteController inputNoteController = new InputNoteController (model,view);

            inputNoteController.inputWithScanner();
        try {
            inputNoteController.inputWithScanner();
        } catch (InputException e) {
            view.message(view.WRONG_NICKNAME);
            inputNoteController.inputWithScanner();

        }


    }
}
