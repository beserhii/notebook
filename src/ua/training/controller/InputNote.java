package ua.training.controller;

import java.util.Scanner;

public class InputNote {

    enum Group{FIRST, MIDDLE, LAST}

    Person user = new Person();

    public String firstName = "Zahar";
    public String fullName = "Zahar Ivanovich Shevchuk";
    public String middleName = "Ivanovich";
    public String lastName = "Shevchuk";
    public String nickName = "zaha";
    public String comments = "This is my comment";
    public Group group = Group.FIRST;
    public String phoneHome = "+38(044)545-45-45";
    public String phoneMobil = "+38(066)122-88-33";
    public String phoneFirst = null;
    public String phoneSecond = null;
    public String email = "zaha@gmail.com";
    public String skype = null;
    public int index=1214;
    public String city="Kiyv";
    public String street="Pravdy";
    public int numHouse=2;
    public int numApartment=12;



}
