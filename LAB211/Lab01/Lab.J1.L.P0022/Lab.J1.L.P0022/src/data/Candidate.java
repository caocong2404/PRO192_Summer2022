package data;

import java.util.Scanner;
import util.MyToyDate;
import util.MyToys;

public class Candidate {

    protected String candidateID, firstName,
            lastName, birthDate, address, phone, email;
    protected int candidateType;

    public Candidate(String candidateID, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public Candidate() {
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return candidateID + " | " + firstName + " " + lastName + " | " + birthDate + " | " + address + " | " + phone + " | " + email + " | " + candidateType;
    }

    public void input(int type) {

        Scanner sc = new Scanner(System.in);
        candidateID = MyToys.getStringbyFormat("Input Candidate ID: ", "The Candidate ID must in format Sxxx!!", "S\\d{3}");
        firstName = MyToys.getString("Input first name: ", "The name do not empty!!!");
        lastName = MyToys.getString("Input last name: ", "The name do not empty!!!");
        birthDate = MyToyDate.getYear("Input Birthday: ", "The Birthday must be in 1990-now!!");
        address = MyToys.getString("Input Address: ", "The address do not empty!!");
        phone = MyToys.getStringbyFormat("Input Phone Number: ", "Phone number with 10 numbers!!!", "\\d{10}");
        email = MyToys.getMail("Input your mail: ", "Enter again!!");
        candidateType = type;
    }
    
    public void showProfile(){
        //ten | birth | add | sdt | mail | type
        System.out.printf("%-20s | %-4s | %-15s | %-10s | %-15s | %d", firstName + " " + lastName, birthDate, address, phone, email, candidateType );
    }

}
