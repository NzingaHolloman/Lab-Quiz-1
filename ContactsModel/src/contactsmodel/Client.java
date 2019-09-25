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
public class Client {

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    private String firstname;
    private String lastname;
    private String gender;
    private int age;
    private String phone;
    private String email;

    
    public Client(){
        firstname ="";
        lastname = "";
        gender = "";
        age = 0;
        phone = "";
        email = "";
    }
    public Client(String fn, String ln, String gndr, int age, String phone, String email) {
        firstname = fn;
        lastname = ln;
        gender = gndr;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
    //getters and Setters for each property
    @Override
    public String toString(){
        String st = getFirstname() +","+getLastname()+","+getGender()+","+ Integer.toString(getAge())+","+getPhone()+","+getEmail();
        return st;
    }
    
}
