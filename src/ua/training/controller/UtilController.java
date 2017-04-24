package ua.training.controller;

import java.util.Scanner;

public class UtilController {
    private String doMatch(Scanner sc, String messageForView, String regex) {
        view.message(messageForView);
        String valueWithScanner = sc.nextLine();
        while (!checkForRegex(valueWithScanner, regex)) {
            valueWithScanner = sc.nextLine();
        }
        return valueWithScanner;
    }

    public boolean checkForRegex(String value, String regex) {
        if (value.matches(regex)) {
            return true;
        }
        view.message(view.WRONG_DATA, view.DOT, view.SPACE, view.AGAIN, view.DOT);
        return false;
    }
}
