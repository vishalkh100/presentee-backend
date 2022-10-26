package net.pantherStudios.springboot.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance_record")
public class AttendanceRecord {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "id_new")
	private long id_new;

    @Column(name = "in_time")
	private Timestamp in_time;

    @Column(name = "out_time")
	private Timestamp out_time;

    @Column(name = "section_code")
	private String section_code;

    public AttendanceRecord() {
		
	}
	
	public AttendanceRecord(long id_new, Timestamp in_time, Timestamp out_time, String section_code) {
		super();
		this.id_new = id_new;
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

    public long getId_new() {
        return this.id_new;
    }

    public void setId_new(long id_new) {
        this.id_new = id_new;
    }

    public Timestamp getIn_time() {
        return this.in_time;
    }

    public void setIn_time(Timestamp in_time) {
        this.in_time = in_time;
    }

    public Timestamp getOut_time() {
        return this.out_time;
    }

    public void setOut_time(Timestamp out_time) {
        this.out_time = out_time;
    }

    public String getSection_code() {
        return this.section_code;
    }

    public void setSection_code(String section_code) {
        this.section_code = section_code;
    }
    
}
