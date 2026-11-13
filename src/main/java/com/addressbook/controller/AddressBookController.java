/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC2
 * Description: Handles REST requests and delegates business logic to the service layer.
 * Name: Asher Mustafa
 * @author Asher
 * Date: 13/11/2026
 */

package com.addressbook.controller;

import com.addressbook.dto.AddressBookDTO;
import com.addressbook.service.AddressBookService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private static final Logger logger =
            LoggerFactory.getLogger(AddressBookController.class);

    // [Asher Mustafa]: Service interface dependency
    private final AddressBookService addressBookService;

    // [Asher Mustafa]: Constructor injection
    public AddressBookController(AddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    // [Asher Mustafa]: GET: Retrieve all contacts
    @GetMapping({"", "/"})
    public ResponseEntity<List<AddressBookDTO>> getAllContacts() {

        logger.info("GET request received for all contacts");

        return ResponseEntity.ok(addressBookService.getAllContacts());
    }

    // [Asher Mustafa]: GET: Retrieve contact using ID
    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBookDTO> getContactById(
            @PathVariable("id") int id) {

        logger.info("GET request received for contact ID: {}", id);

        return ResponseEntity.ok(
                addressBookService.getContactById(id)
        );
    }

    // [Asher Mustafa]: POST: Create a contact
    @PostMapping("/create")
    public ResponseEntity<AddressBookDTO> createContact(
            @RequestBody AddressBookDTO dto) {

        logger.info("POST request received to create contact");

        AddressBookDTO response =
                addressBookService.createContact(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // [Asher Mustafa]: PUT: Update a contact
    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBookDTO> updateContact(
            @PathVariable("id") int id,
            @RequestBody AddressBookDTO dto) {

        logger.info("PUT request received for contact ID: {}", id);

        return ResponseEntity.ok(
                addressBookService.updateContact(id, dto)
        );
    }

    // [Asher Mustafa]: DELETE: Delete a contact
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContact(
            @PathVariable("id") int id) {

        logger.info("DELETE request received for contact ID: {}", id);

        return ResponseEntity.ok(
                addressBookService.deleteContact(id)
        );
    }
}