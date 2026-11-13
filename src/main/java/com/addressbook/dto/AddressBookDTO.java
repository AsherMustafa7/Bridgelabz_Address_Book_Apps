/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC1
 * Description: Transfers contact information between the client and controller.
 * Name: Asher Mustafa
 * @author Asher
 * Date: 13/11/2026
 */

package com.addressbook.dto;

public class AddressBookDTO {

    // [Asher Mustafa]: Contact information received from the client
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // [Asher Mustafa]: Default constructor
    public AddressBookDTO() {
    }

    // [Asher Mustafa]: Parameterized constructor
    public AddressBookDTO(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // [Asher Mustafa]: Getters and setters
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