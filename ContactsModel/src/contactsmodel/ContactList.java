/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

/**
 *
 * @author nzing
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class ContactList {
    private String listName;
    private ArrayList<Client> contacts = new ArrayList<Client>();
    //int count = 0;
    
    public ContactList(){
        
    }
    public String getListName(){
        return listName;
    }
    public void setListName(String listName){
        this.listName = listName;
    }
    @Override
    public String toString(){
        String listString = "";//listName+"\n";
        String holder;
        for(Client c :contacts){
            
            holder = c.toString();
            //System.out.println(holder);
            //listString += " ";
            listString += holder;
            listString += " ";
        }
        
        return listString;
    }
    public Client getContact(int index){
        Client c = new Client(); 
        return c;        
    }
    public int size(){
        return contacts.size();
    }
    public void deleteContact(int index){
        contacts.remove(index-1);
    }
    public void addContact(Client client){
        contacts.add(client);
    }
    public void loadContacts(String filename){
        try {
            Scanner scan = new Scanner(new File(filename));
            int count = 0;
            
            String first = scan.nextLine();
            setListName(first);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                
                    String[] value = line.split(",");
                
                    String firstName = value[0].trim();
                    String lastName = value[1].trim();
                    String gender = value[2].trim();
                    int age = Integer.parseInt(value[3].trim());
                    String phone = value[4].trim();
                    String email = value[5].trim();
                    
                    Client exlc = new Client(firstName, lastName, gender, age, phone,email);                              
                    addContact(exlc);
                  
                    count++;
                
            }System.out.println(toString());
        }catch (FileNotFoundException ex) {
            System.err.println("file not found");
        }        
    }
    public void saveContacts(String filename) throws IOException {
        //System.out.println(getListName());
        //System.out.println(toString());
        
        FileOutputStream fileByteStream = null;
        PrintWriter outFS= null;
        
        fileByteStream = new FileOutputStream(filename);
        outFS = new PrintWriter(fileByteStream);
        
        outFS.print(getListName());
        //outFS.flush();
        int index=0;
        do{
            Client k =contacts.get(index);
            String line = k.toString();
                if (line.contains(",")){
                    String[] value = line.split(",");
                
                    String firstName = value[0];//.trim();
                    String lastName = value[1];//.trim();
                    String gender = value[2];//.trim();
                    int age = Integer.parseInt(value[3]);//.trim());
                    String phone = value[4];//.trim();
                    String email = value[5];//.trim();
                    //outFS.print(index+1+" ");
                    outFS.printf("\n%s,%s,%s,%s,%s,%s",firstName, lastName, gender,age,phone,email);
                    index = index+1;
                }
        }while(index<contacts.size());
        //outputFile.println(toString());
        outFS.flush();
        fileByteStream.close();
    }
}
