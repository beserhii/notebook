package ua.training.controller;

import ua.training.view.View;

public class Person {
    enum Group{A1, A2, B1, B2, C1, C2}

    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String comments;
    private Group group;
    private String phoneHome;
    private String phoneMobil;
    private String phoneMobilSecond;
    private String email;
    private String skype;
    private Address address;

    public class Address{
        String indexCity;
        String city;
        String street;
        String numHouse;
        String numApartment;
    }

    public Person() {
        this.address = new Address();
    }

    public boolean checkForRegex(String value, String regex){

        if (value.matches(regex)){
            return true;
        }
        View.message(View.WRONG_DATA);
        return false;
    }

    public String getFullName() {
        return this.firstName+" "+this.middleName+" "+this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = Group.valueOf(group);
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneMobil() {
        return phoneMobil;
    }

    public void setPhoneMobil(String phoneMobil) {
        this.phoneMobil = phoneMobil;
    }

    public String getPhoneMobilSecond() {
        return phoneMobilSecond;
    }

    public void setPhoneMobilSecond(String phoneMobilSecond) {
        this.phoneMobilSecond = phoneMobilSecond;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String indexCity, String city, String street, String house, String apartment) {

        this.address.indexCity = indexCity;
        this.address.city = city;
        this.address.street = street;
        this.address.numHouse = house;
        this.address.numApartment = apartment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + getFullName() + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comments='" + comments + '\'' +
                ", group=" + group +
                ", phoneHome='" + phoneHome + '\'' +
                ", phoneMobil='" + phoneMobil + '\'' +
                ", phoneMobilSecond='" + phoneMobilSecond + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address.indexCity + ", " + address.city + ", "  + address.street + " "  + address.numHouse + ", "  + address.numApartment +
                '}';
    }
}




