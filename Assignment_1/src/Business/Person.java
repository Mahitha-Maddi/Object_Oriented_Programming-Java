
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mahit
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String dateOfBirth;
    private String age;
    private String height;
    private String weight;
    private String socialSecurityNumber;
    private Address address;
    private AccountInformation savingsAccountInformation;
    private AccountInformation checkingsAccountInformation;
    private DriversLicenseInformation driversLicenseInformation;
    private MedicalRecord medicalRecord;
    /*
     * @param args the command line arguments
     */

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountInformation getSavingsAccountInformation() {
        return savingsAccountInformation;
    }

    public void setSavingsAccountInformation(AccountInformation savingsAccountInformation) {
        this.savingsAccountInformation = savingsAccountInformation;
    }

    public AccountInformation getCheckingsAccountInformation() {
        return checkingsAccountInformation;
    }

    public void setCheckingsAccountInformation(AccountInformation checkingsAccountInformation) {
        this.checkingsAccountInformation = checkingsAccountInformation;
    }

   
    public DriversLicenseInformation  getDriversLicenseInformation() {
        return driversLicenseInformation;
    }

    public void setDriversLicenseInformation(DriversLicenseInformation driversLicenseInformation) {
        this.driversLicenseInformation = driversLicenseInformation;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
   
}


