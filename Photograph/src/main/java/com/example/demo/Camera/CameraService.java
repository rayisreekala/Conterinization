package com.example.demo.Camera;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;


@Service
public class CameraService {
	@Autowired
	JdbcTemplate jdbc;
	

	public List<Map<String,Object>> getCameraMen(){
		String sql="select * from profiles";
		return jdbc.queryForList(sql);
	}


}
