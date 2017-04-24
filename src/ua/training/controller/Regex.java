package ua.training.controller;

public interface Regex {

    public static final String REGEX_NAME="[A-Za-z]+";
    public static final String REGEX_CITY_STREET="[A-Za-z_-]*";
    public static final String REGEX_HOUSE_NUMBER="[0-9A-Za-z_-]+";
    public static final String REGEX_COMMENT=".*";
    public static final String REGEX_FULLNAME="^([A-Za-z]+)\\s([A-Za-z]+)\\s([A-Za-z]+)$";
    public static final String REGEX_GROUP="(A1)|(A2)|(B1)|(B2)|(C1)|(C2)";
    public static final String REGEX_PHONE ="^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    public static final String REGEX_PHONE_MOBIL="^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    public static final String REGEX_PHONE_MOBIL_SECOND="^(\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2})?$";
    public static final String REGEX_EMAIL="^([a-z0-9_-]\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    public static final String REGEX_SKYPE="^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";
    public static final String REGEX_INDEX_CITY="[0-9]{5}";
}
