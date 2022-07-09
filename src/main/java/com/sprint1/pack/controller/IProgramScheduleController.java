package com.sprint1.pack.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.pack.dao.IProgramScheduleDao;
import com.sprint1.pack.model.ProgramScheduled;

@RestController
public class IProgramScheduleController {
@Autowired
private IProgramScheduleDao dao1;
@PostMapping(path="/create ProgramSchedule")
public ProgramScheduled addProgramSchedule(@RequestBody ProgramScheduled programSchedule) {
	return dao1.addProgramSchedule(programSchedule);
}
@GetMapping(path="/getProgramScheduleByDate/{startDate}")
public List<ProgramScheduled> getProgramScheduleByDate(@PathVariable String startDate){
	return dao1.getProgramScheduleByDate(startDate);
}
@GetMapping(path="/getProgramScheduleByCollegeName/{collegeName}")
public List<ProgramScheduled> getProgramScheduleByCollegeName(@PathVariable String collegeName){
	return dao1.getProgramScheduleByCollegeName(collegeName);
}
@DeleteMapping(path="/deleteProgramScheduleById/{scheduleId}")
public int deleteProgramScheduleById(@PathVariable int scheduleId) {
	return dao1.deleteProgramScheduleById(scheduleId);
}
@GetMapping(path="/getProgramScheduleById/{scheduleId}")
public ProgramScheduled getProgramScheduleById(@PathVariable int scheduleId) {
	return dao1.getProgramScheduleById(scheduleId);
}
@PutMapping(path="/UpdateProgramSchedule/{scheduleId}")
public int updateProgramSchedule(@RequestBody ProgramScheduled ProgramScheduleId,@PathVariable int scheduleId) {
return dao1.updateProgramSchedule(ProgramScheduleId);
}
}