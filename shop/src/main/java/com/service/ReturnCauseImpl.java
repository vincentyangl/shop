package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ReturnCause;
import com.mapper.ReturnCauseDao;

@Service
public class ReturnCauseImpl implements ReturnCauseService{

	@Autowired
	private ReturnCauseDao returnCauseDao;
	@Override
	public ReturnCause getById(int retCauseId) {
		return returnCauseDao.getById(retCauseId);
	}

}
