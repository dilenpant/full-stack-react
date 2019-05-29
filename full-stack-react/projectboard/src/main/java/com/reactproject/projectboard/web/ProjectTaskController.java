package com.reactproject.projectboard.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactproject.projectboard.model.ProjectTask;
import com.reactproject.projectboard.service.ProjectTaskService;

@RestController
@RequestMapping("api/proj")
@CrossOrigin
public class ProjectTaskController {
	
	@Autowired
	private ProjectTaskService projectTaskServices;
	
	@PostMapping("")
	public ResponseEntity<?> addtoTheBoard(@Valid @RequestBody ProjectTask project, BindingResult result){
		
		if(result.hasErrors()) {
			Map<String,String> errorMap= new HashMap();
			
			for(FieldError error:result.getFieldErrors()) {
				
				errorMap.put(error.getField(), error.getDefaultMessage());
				
			}
			
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}
		
		ProjectTask newpt =  projectTaskServices.saveOrUpdatePT(project);
		
		return new ResponseEntity<ProjectTask>(newpt, HttpStatus.CREATED);
	}

}
