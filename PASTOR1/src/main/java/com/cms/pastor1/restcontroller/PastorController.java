package com.cms.pastor1.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.pastor1.entity.PastorEntity;
import com.cms.pastor1.service.PastorService;
@RestController
public class PastorController {
	@Autowired
	private  PastorService pastorService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> savePaster(@RequestBody  PastorEntity entity ){
		
		String savePaster = pastorService.savePaster(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(savePaster);
		



}
}