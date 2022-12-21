package com.bridgelabz.Addressbook.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {
    private String firstName,lastName ,address,city,state,email;
    private int pinCode;
    private long phoneNumber;



}
