package com.ticketbooking.api.flimhub.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Paymentmode")
public class Payment {

    @Id
    private String paymentId;
    private String paymentmode;
    private Long referenceno;
    private Long totalamount;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public Long getReferenceno() {
        return referenceno;
    }

    public void setReferenceno(Long referenceno) {
        this.referenceno = referenceno;
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }
}
