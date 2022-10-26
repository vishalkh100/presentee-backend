package net.pantherStudios.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pay_entries")
public class PayEntries {

    @Id
	private long id;

    @Column(name = "date")
	private Date date;

    @Column(name = "hours")
	private float hours;

    @Column(name = "amount")
	private float amount;

    public PayEntries() {
		
	}
	
	public PayEntries(long id, Date date, float hours, float amount) {
		super();
		this.id = id;
        this.date = date;
        this.hours = hours;
        this.amount = amount;
	}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getHours() {
        return this.hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
}
