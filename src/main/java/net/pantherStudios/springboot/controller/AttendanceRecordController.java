package net.pantherStudios.springboot.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.pantherStudios.springboot.exception.ResourceNotFoundException;
import net.pantherStudios.springboot.model.AttendanceRecord;
// import net.pantherStudios.springboot.model.Employee;
import net.pantherStudios.springboot.repository.AttendanceRecordRepository;
// import net.pantherStudios.springboot.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AttendanceRecordController {

	@Autowired
	private AttendanceRecordRepository attendanceRecordRepository;
	
	// get all employees
	@GetMapping("/attendance")
	public List<AttendanceRecord> getAllEmployees(){
		return attendanceRecordRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping("/attendance")
	public AttendanceRecord createEmployee(@RequestBody AttendanceRecord attendanceRecord) {
		return attendanceRecordRepository.save(attendanceRecord);
	}
	
	// get employee by id rest api
	@GetMapping("/attendance/{id}")
	public ResponseEntity<AttendanceRecord> getEmployeeById(@PathVariable Long id) {
		AttendanceRecord attendanceRecord = attendanceRecordRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(attendanceRecord);
	}
	
	// update employee rest api
	
	// @PutMapping("/attendance/{id}")
	// public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
	// 	Employee employee = employeeRepository.findById(id)
	// 			.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
	// 	employee.setEmployee_name(employeeDetails.getEmployee_name());
	// 	employee.setDob(employeeDetails.getDob());
	// 	employee.setRes_address(employeeDetails.getRes_address());
	// 	employee.setPerm_address(employeeDetails.getPerm_address());
	// 	employee.setContact(employeeDetails.getContact());
	// 	employee.setAcc_number(employeeDetails.getAcc_number());
	// 	employee.setIfsc(employeeDetails.getIfsc());
	// 	employee.setEsic(employeeDetails.getEsic());
	// 	employee.setPt(employeeDetails.getPt());
	// 	employee.setAadhaar(employeeDetails.getAadhaar());
	// 	employee.setPan(employeeDetails.getPan());
	// 	employee.setRate(employeeDetails.getRate());
		
	// 	Employee updatedEmployee = employeeRepository.save(employee);
	// 	return ResponseEntity.ok(updatedEmployee);
	// }
	
	// delete employee rest api
	@DeleteMapping("/attendance/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		AttendanceRecord attendanceRecord = attendanceRecordRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		attendanceRecordRepository.delete(attendanceRecord);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
