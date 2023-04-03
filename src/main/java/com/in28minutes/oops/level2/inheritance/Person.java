package com.in28minutes.oops.level2.inheritance;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name) {
        System.out.println("Person Constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // method overriding: it means that I am changing the implementation of the toString() method
    // from the Object.java class, which is as follows:
    //                               public String toString() {
    //                                     return getClass().getName() + "@" + Integer.toHexString(hashCode());
    //                               }
    public String toString() {
        return String.format("name: %s, email: %s, phone number: %s", name, email, phoneNumber);
    }
}
