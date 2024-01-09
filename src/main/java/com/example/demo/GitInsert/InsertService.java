package com.example.demo.GitInsert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class InsertService {
	
	@Autowired JdbcTemplate js;
	public String InsertClg(Insert p ) {
		String name=p.getName();
		String branch=p.getBranch();
		String clg=p.getClg();
		String sql="insert into clgtable values(?,?,?)";
		js.update(sql,name,branch,clg);
		return "inserted";
	}

	}

