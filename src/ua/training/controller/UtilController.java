package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;

public class UtilController {

    public String doMatch(Scanner sc, String messageForView, String regex) {
        View.message(messageForView);
        String valueWithScanner = sc.nextLine();
        while (!checkForRegex(valueWithScanner, regex)) {
            valueWithScanner = sc.nextLine();
        }
        return valueWithScanner;
    }

    private boolean checkForRegex(String value, String regex) {
        if (value.matches(regex)) {
            return true;
        }
        View.message(View.WRONG_DATA, View.DOT, View.SPACE, View.AGAIN, View.DOT);
        return false;
    }


}
