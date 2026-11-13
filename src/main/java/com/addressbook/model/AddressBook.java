/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC1
 * Description: Represents the AddressBook model containing basic contact details.
 * Name: Asher Mustafa
 * @author Asher
 * Date: 13/11/2026
 */

package com.addressbook.model;

public class AddressBook {

    // [Asher Mustafa]: Unique identifier of the contact
    private int id;

    // [Asher Mustafa]: Basic contact information
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // [Asher Mustafa]: Default constructor
    public AddressBook() {
    }

    // [Asher Mustafa]: Parameterized constructor
    public AddressBook(int id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // [Asher Mustafa]: Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}