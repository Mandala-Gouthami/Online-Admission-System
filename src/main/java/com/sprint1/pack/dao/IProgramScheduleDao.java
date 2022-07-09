package com.sprint1.pack.dao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.pack.model.ProgramScheduled;
import com.sprint1.pack.repository.IProgramScheduleRepository;
import com.sprint1.pack.service.IProgramScheduleService;

@Service
public class IProgramScheduleDao implements  IProgramScheduleService{
@Autowired
private IProgramScheduleRepository repositoryschedule;

@Override
public ProgramScheduled addProgramSchedule(ProgramScheduled programSchedule) {
	// TODO Auto-generated method stub
	return repositoryschedule.save(programSchedule);
}


@Override
public List<ProgramScheduled> viewAllProgramScheduleDetails() {
	// TODO Auto-generated method stub
	return repositoryschedule.findAll();
}

@Override
public List<ProgramScheduled> getProgramScheduleByCollegeName(String collegeName) {
	// TODO Auto-generated method stub
	return repositoryschedule.getProgramScheduleByCollegeName(collegeName);
}

@Override
public List<ProgramScheduled> getProgramScheduleByDate(String startDate) {
	// TODO Auto-generated method stub
	Date sdate=null;
	try {
		sdate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return repositoryschedule.getProgramScheduleByDate(sdate);
}

@Override
public int deleteProgramScheduleById(int scheduleId) {
	// TODO Auto-generated method stub
	return repositoryschedule.deleteProgramScheduleById(scheduleId);
}

@Override
public ProgramScheduled getProgramScheduleById(int scheduleId) {
	// TODO Auto-generated method stub
	return repositoryschedule.findById(scheduleId).get();
}


@Override
public int updateProgramSchedule(ProgramScheduled ProgramScheduleId) {
	// TODO Auto-generated method stub
	int k= ProgramScheduleId.getScheduleId();
	Date p=ProgramScheduleId.getStartDate();
	int w=repositoryschedule.updateProgramSchedule(p,k);
	return w;
}
}
