package com.example.demo.Camera;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cameramen")
public class CameraController {
	
	@Autowired
	CameraService cs;
	
	@GetMapping("/get")
		// TODO Auto-generated method stub
		public List<Map<String,Object>> getCameraMen() {
			return cs.getCameraMen();
			
	}

}
