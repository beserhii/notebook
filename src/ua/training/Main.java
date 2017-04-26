package ua.training;

import ua.training.controller.Controller;
import ua.training.controller.InputException;
import ua.training.model.Model;
import ua.training.view.View;

public class Main {
    public static void main(String[] args) throws InputException{
        Model model =new Model();
        View view =new View();
        Controller controller = new Controller(model,view);
        controller.processUser();
    }
}
