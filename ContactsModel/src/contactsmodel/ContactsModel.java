/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nzing
 */
public class ContactsModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Step one
        Client c = new Client();
        Client example1 = new Client("Nzinga", "Holloman", "female", 19,"(215)808-0207","nh@yahoo.com");
        Client example2 = new Client("Zalikha", "Holloman", "female", 18,"(215)543-980","zal@gmail.com");
        Client example3 = new Client("Munashe", "Holloman", "female", 21,"(215)121-0987","mmhh@verizon.net");
        
        //System.out.println(example1.toString());
        int delete = 97;
        //Step two
        ContactList ex = new ContactList();
        String file = "contacts.txt";
        ex.loadContacts(file);
        //ex.addContact(example1);
        //ex.addContact(example2);
        //ex.addContact(example3);
        //ex.deleteContact(delete);
        try {
            ex.saveContacts(file);
        } catch (FileNotFoundException ex1) {
            System.err.println("file not found");
        }
    }  
}
