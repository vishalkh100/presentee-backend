package net.pantherStudios.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance_record")
public class AttendanceRecord {

    @Id
	private long id;

    @Column(name = "in_time")
	private Date in_time;

    @Column(name = "out_time")
	private Date out_time;

    @Column(name = "section_code")
	private String section_code;

    public AttendanceRecord() {
		
	}
	
	public AttendanceRecord(long id, Date in_time, Date out_time, String section_code) {
		super();
		this.id = id;
        this.in_time = in_time;
        this.out_time = out_time;
        this.section_code = section_code;
	}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getIn_time() {
        return this.in_time;
    }

    public void setIn_time(Date in_time) {
        this.in_time = in_time;
    }

    public Date getOut_time() {
        return this.out_time;
    }

    public void setOut_time(Date out_time) {
        this.out_time = out_time;
    }

    public String getSection_code() {
        return this.section_code;
    }

    public void setSection_code(String section_code) {
        this.section_code = section_code;
    }
    
}
