package ua.training.view;

import java.util.Arrays;

public class View {

    public static final String INPUT="Input ";
    public static final String FIRST_NAME="First name: ";
    public static final String MIDDLE_NAME="Middle name: ";
    public static final String LAST_NAME="Last name: ";
    public static final String NICKNAME="Nickname: ";
    public static final String WRONG_NICKNAME="Name already exists, enter new nickname: ";
    public static final String EMAIL="Email: ";
    public static final String SKYPE="Skype: ";
    public static final String INDEX_CITY="Index city: ";
    public static final String CITY="City name: ";
    public static final String STREET_NAME="Street name: ";
    public static final String HOUSE_NUMBER="House number: ";
    public static final String APARTMENT_NUMBER="Apartment number: ";
    public static final String GROUP="Group(A1, A2, B1, B2, C1, C2): ";
    public static final String PHONE="Phone number (+38(044)123-12-23): ";
    public static final String PHONE_MOBIL="Mobil phone number [+38(067)123-12-23]: ";
    public static final String PHONE_MOBIL_SECOND="Mobil phone number [+38(067)123-12-23] or null: ";
    public static final String DOT=".";
    public static final String SPACE=" ";
    public static final String COMMENT="Comments";
    public static final String WRONG_DATA="Wrong data";
    public static final String AGAIN="Input again";

    public static void message(String ... message){
        System.out.println(concatMessage(message));
    }

    private static String concatMessage(String...message){
        String result="";
        for (String s : message) {
            result+=s;
        }
        return result;
    }
}
