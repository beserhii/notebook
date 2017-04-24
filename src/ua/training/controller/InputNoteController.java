package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class InputNoteController {

    Model model;
    View view;

    public InputNoteController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void inputWithScanner(Scanner sc) {
        Person person = new Person();
        UtilController utilController = new UtilController();

        person.setFirstName(utilController.doMatch(sc, view.FIRST_NAME, Regex.REGEX_NAME));
        person.setMiddleName(utilController.doMatch(sc, view.MIDDLE_NAME, Regex.REGEX_NAME));
        person.setLastName(utilController.doMatch(sc, view.LAST_NAME, Regex.REGEX_NAME));
        view.message("OK", view.SPACE, person.getFullName());
        person.setNickName(utilController.doMatch(sc, view.NICKNAME, Regex.REGEX_COMMENT));
        person.setComments(utilController.doMatch(sc, view.COMMENT, Regex.REGEX_COMMENT));
        person.setGroup(utilController.doMatch(sc, view.GROUP, Regex.REGEX_GROUP));
        person.setPhoneHome(utilController.doMatch(sc, view.PHONE, Regex.REGEX_PHONE));
        person.setPhoneMobil(utilController.doMatch(sc, view.PHONE_MOBIL, Regex.REGEX_PHONE));
        person.setPhoneMobilSecond(utilController.doMatch(sc, view.PHONE_MOBIL_SECOND, Regex.REGEX_PHONE_MOBIL_SECOND));
        person.setEmail(utilController.doMatch(sc, view.EMAIL, Regex.REGEX_EMAIL));
        person.setSkype(utilController.doMatch(sc, view.SKYPE, Regex.REGEX_SKYPE));
        person.setAddress(utilController.doMatch(sc, view.INDEX_CITY, Regex.REGEX_INDEX_CITY),
                utilController.doMatch(sc, view.CITY, Regex.REGEX_CITY_STREET),
                utilController.doMatch(sc, view.STREET_NAME, Regex.REGEX_CITY_STREET),
                utilController.doMatch(sc, view.HOUSE_NUMBER, Regex.REGEX_HOUSE_NUMBER),
                utilController.doMatch(sc, view.APARTMENT_NUMBER, Regex.REGEX_HOUSE_NUMBER));

        model.addNote((new SimpleDateFormat("dd/MM/yyyy")
                .format(Calendar.getInstance().getTime())
                .toString()), person);

    }

}
