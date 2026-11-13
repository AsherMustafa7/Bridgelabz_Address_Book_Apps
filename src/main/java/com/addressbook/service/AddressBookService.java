/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC2
 * Description: Defines service operations for managing AddressBook contacts.
 * Name: Asher Mustafa
 * @author Asher
 * Date: 13/11/2026
 */

package com.addressbook.service;

import com.addressbook.dto.AddressBookDTO;

import java.util.List;

public interface AddressBookService {

    // [Asher Mustafa]: Retrieve all contacts
    List<AddressBookDTO> getAllContacts();

    // [Asher Mustafa]: Retrieve a contact using its ID
    AddressBookDTO getContactById(int id);

    // [Asher Mustafa]: Create a new contact
    AddressBookDTO createContact(AddressBookDTO dto);

    // [Asher Mustafa]: Update an existing contact
    AddressBookDTO updateContact(int id, AddressBookDTO dto);

    // [Asher Mustafa]: Delete a contact using its ID
    String deleteContact(int id);
}