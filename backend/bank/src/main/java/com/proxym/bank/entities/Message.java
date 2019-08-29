package com.proxym.bank.entities;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import  java.util.Date;

@Document(collection = "message")
public class Message {
    @Id
    private ObjectId _id;

    private long id;
    private String data;
    private String from;
    private String to;
    private Date createdAt;

    public  Message() {}

    public Message ( long id, String data, String from, String to, Date createdAt){
        this.id = id;
        this.data= data;
        this.from = from;
        this.to = to;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
