package com.bridgelabz.Addressbook.app.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.Addressbook.app.dto.AddressBookDTO;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @RequestMapping ({"","/","/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{addressbookID}")
    public ResponseEntity<String> getAddressBookDataByID(@PathVariable("addressbookID") int addressbookID){
        return new ResponseEntity<String>("Get Call Success by ID Is "+addressbookID, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addDataInAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Added Address Book Data For : "+addressBookDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public  ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Updated Address Book Data For : "+addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addressbookID}")
    public ResponseEntity<String> deleteAddressBookDataByID(@PathVariable("addressbookID") int addressbookID){
        return new ResponseEntity<String>("Delete Call Success by ID Is "+addressbookID, HttpStatus.OK);
    }

}