package com.ticketbooking.api.flimhub.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Seatmanagement")
public class Seatmanagement {

    @Id
    private String seatId;
    private String Timing;

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getTiming() {
        return Timing;
    }

    public void setTiming(String timing) {
       this. Timing = timing;
    }
}
