package com.bogle.erp.entity;

import java.sql.Timestamp;

public class Product {
    private Long id;

    private String producer;

    private String contact;

    private String phone;

    private String email;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String typ;

    private String colourTemperature;

    private String bri;

    private Double price;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ == null ? null : typ.trim();
    }

    public String getColourTemperature() {
        return colourTemperature;
    }

    public void setColourTemperature(String colourTemperature) {
        this.colourTemperature = colourTemperature == null ? null : colourTemperature.trim();
    }

    public String getBri() {
        return bri;
    }

    public void setBri(String bri) {
        this.bri = bri == null ? null : bri.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}