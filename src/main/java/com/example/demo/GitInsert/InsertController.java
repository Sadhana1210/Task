package com.example.demo.GitInsert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InsertController {
	
			@Autowired
			InsertService Is;
			@PostMapping("InsertProject")
			public String Insert1(@RequestBody Insert i) {
				return  Is.InsertClg(i);
			}
		}


