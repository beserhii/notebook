package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {

        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        new InputNoteController(model,view).inputWithScanner(sc);

    }
}
