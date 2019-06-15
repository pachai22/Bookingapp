package com.ticketbooking.api.flimhub.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Theatre")
public class Theatre {

    @Id
    private String theatreId;
    private String theatreName;

    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
}
