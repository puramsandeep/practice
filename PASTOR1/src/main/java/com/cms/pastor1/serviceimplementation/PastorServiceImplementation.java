package com.cms.pastor1.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.pastor1.entity.PastorEntity;
import com.cms.pastor1.repository.PastorRepository;
import com.cms.pastor1.service.PastorService;

@Service
public class PastorServiceImplementation implements PastorService{

	@Autowired
	private PastorRepository pastorRepository;

	public String savePaster(PastorEntity entity) {
		
			pastorRepository.save(entity);
			return "success";
		}

	@Override
	public PastorEntity updatePastor(Integer id, PastorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PastorEntity deletePastor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PastorEntity getPastor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	}

