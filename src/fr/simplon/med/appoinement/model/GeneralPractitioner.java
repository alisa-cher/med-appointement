package fr.simplon.med.appoinement.model;

public class GeneralPractitioner {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private static Integer rate = 25;

    public GeneralPractitioner(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Integer getRate() {
        return rate;
    }

    public static void setRate(Integer rate) {
        GeneralPractitioner.rate = rate;
    }

    public String getLastName() {
        return lastName;
    }

    public void print () {
        System.out.println(lastName + " " + firstName);
        System.out.println("Numero de telephone : "+ phoneNumber);
        System.out.println("Tarif : "+ rate);
    }
}
