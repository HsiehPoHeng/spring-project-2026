/**
 * 
 */
/**
 * @author HSIEH
 *
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StaffModel;
import com.example.service.StaffService;

@RestController
public class StaffController {
	
		@Autowired
		StaffModel staffModel;
		
		@Autowired
		StaffService staffService;
	    @RequestMapping("/addStaff")
	    public String hello(){
	    	staffModel = new StaffModel();
	    	staffModel.setPassword("abc123");
	    	staffModel.setEmail("email@email.com");
	    	staffModel.setPhone("0933123123");
	    	staffModel.setPosition("經理");
	    	staffService.addStaff(staffModel);
	        return "New Staff added";
	    }


}