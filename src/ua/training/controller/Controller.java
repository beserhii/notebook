package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        input(sc);
    }

    public void input(Scanner sc) {
        Person person = new Person();

        person.setFirstName(doMatch(sc, view.FIRST_NAME, Regex.REGEX_NAME));
        person.setMiddleName(doMatch(sc, view.MIDDLE_NAME, Regex.REGEX_NAME));
        person.setLastName(doMatch(sc, view.LAST_NAME, Regex.REGEX_NAME));
        view.message("OK", view.SPACE, person.getFullName());
        person.setNickName(doMatch(sc, view.NICKNAME, Regex.REGEX_COMMENT));
        person.setComments(doMatch(sc, view.COMMENT, Regex.REGEX_COMMENT));
        person.setGroup(doMatch(sc, view.GROUP, Regex.REGEX_GROUP));
        person.setPhoneHome(doMatch(sc, view.PHONE, Regex.REGEX_PHONE));
        person.setPhoneMobil(doMatch(sc, view.PHONE_MOBIL, Regex.REGEX_PHONE));
        person.setPhoneMobilSecond(doMatch(sc, view.PHONE_MOBIL_SECOND, Regex.REGEX_PHONE_MOBIL_SECOND));
        person.setEmail(doMatch(sc, view.EMAIL, Regex.REGEX_EMAIL));
        person.setSkype(doMatch(sc, view.SKYPE, Regex.REGEX_SKYPE));
        person.setAddress(doMatch(sc, view.INDEX_CITY, Regex.REGEX_INDEX_CITY),
                doMatch(sc, view.CITY, Regex.REGEX_CITY_STREET),
                doMatch(sc, view.STREET_NAME, Regex.REGEX_CITY_STREET),
                doMatch(sc, view.HOUSE_NUMBER, Regex.REGEX_HOUSE_NUMBER),
                doMatch(sc, view.APARTMENT_NUMBER, Regex.REGEX_HOUSE_NUMBER));

        model.addNote((new SimpleDateFormat("dd/MM/yyyy")
                .format(Calendar.getInstance().getTime())
                .toString()), person);

    }

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
