package com.cms.pastor1.service;

import com.cms.pastor1.entity.PastorEntity;

public interface PastorService {

			
			
			public String savePaster(PastorEntity entity);
		     public PastorEntity updatePastor(Integer id, PastorEntity entity);
		     
		     public PastorEntity deletePastor(Integer id);
		     
		     public PastorEntity getPastor(Integer id);
			
}