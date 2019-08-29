package com.proxym.bank.entities;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import  java.util.Date;

@Document(collection = "agent")
public class Agent {
    @Id
    private ObjectId _id;

    private long id;
    private String username;
    private String firstname;
    private String lastname;
    private String password;
    private int phoneNumber;
    private Date createdAt = new Date();
    private Date updateAt = new Date();
    private int cin;
    private String bankname;
    private int idbank;
    private int connected;

    public  Agent(){}

    public Agent( long id, String username, String firstname, String lastname, String password, int phoneNumber, Date createdAt, Date updateAt, int cin, String bankname, int idbank, int connected){
        this.id = id;
        this.setUsername(username);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setPassword(password);
        this.setPhoneNumber(phoneNumber);
        this.setCreatedAt(createdAt);
        this.setUpdateAt(updateAt);
        this.setCin(cin);
        this.setBankname(bankname);
        this.idbank = idbank;
        this.setConnected(connected);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getIdbank() {
        return idbank;
    }

    public void setIdbank(int idbank) {
        this.idbank = idbank;
    }

    public String get_id() {
        return _id.toString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getBankname() {
        return bankname;
    }

    public int getConnected() {
        return connected;
    }

    public void setConnected(int connected) {
        this.connected = connected;
    }
}
