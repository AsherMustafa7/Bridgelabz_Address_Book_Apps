/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC2
 * Description: Tests AddressBookServiceImpl business logic using JUnit 5.
 * Name: Asher Mustafa
 * @author Asher
 * Date: 13/11/2026
 */

package com.addressbook.service;

import com.addressbook.dto.AddressBookDTO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookServiceImplTest {

    private AddressBookServiceImpl service;

    // [Asher Mustafa]: Initialize service before every test
    @BeforeEach
    void setUp() {
        service = new AddressBookServiceImpl();
    }

    // [Asher Mustafa]: Test retrieving all contacts
    @Test
    void testGetAllContacts() {

        List<AddressBookDTO> contacts = service.getAllContacts();

        assertNotNull(contacts);
        assertTrue(contacts.isEmpty());
    }

    // [Asher Mustafa]: Test retrieving contact by ID
    @Test
    void testGetContactById() {

        AddressBookDTO response = service.getContactById(1);

        assertNotNull(response);
        assertEquals("Sample", response.getFirstName());
        assertEquals("Contact", response.getLastName());
    }

    // [Asher Mustafa]: Test creating a contact
    @Test
    void testCreateContact() {

        AddressBookDTO dto = new AddressBookDTO(
                "Asher",
                "Mustafa",
                "9876543210"
        );

        AddressBookDTO response = service.createContact(dto);

        assertNotNull(response);
        assertEquals("Asher", response.getFirstName());
        assertEquals("Mustafa", response.getLastName());
        assertEquals("9876543210", response.getPhoneNumber());
    }

    // [Asher Mustafa]: Test updating a contact
    @Test
    void testUpdateContact() {

        AddressBookDTO dto = new AddressBookDTO(
                "Asher",
                "Mustafa",
                "9999999999"
        );

        AddressBookDTO response = service.updateContact(1, dto);

        assertNotNull(response);
        assertEquals("9999999999", response.getPhoneNumber());
    }

    // [Asher Mustafa]: Test deleting a contact
    @Test
    void testDeleteContact() {

        String response = service.deleteContact(1);

        assertTrue(response.contains("successful"));
    }
}