/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc.finalproject;

/**
 *
 * @author damanglez
 */
public class Account {
    private int id; // Unique number assigned by the system
    private String name;
    private String contactName;
    private String contactEmail;
    private String phoneNumber;
    private String street;
    private String suite; 
    private String city; 
    private String state; 
    private String zipcode;
    
    /**
     * 
     * @param id
     * @param name
     * @param contactName
     * @param contactEmail
     * @param phoneNumber
     * @param street
     * @param suite
     * @param city
     * @param state
     * @param zipcode 
     */
    public Account(int id, String name, String contactName, 
            String contactEmail, String phoneNumber, String street, 
            String suite, String city, String state, String zipcode) {
        this.id = id;
        this.name = name;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * @param contactEmail the contactEmail to set
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the suite
     */
    public String getSuite() {
        return suite;
    }

    /**
     * @param suite the suite to set
     */
    public void setSuite(String suite) {
        this.suite = suite;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Override
    public String toString() {
        return name + " (" + id + "), " + contactName + ", " + contactEmail;
    }
}
