package com.ticketbooking.api.flimhub.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Conformation")
public class Conformation {

    @Id
    private String bookingId;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
