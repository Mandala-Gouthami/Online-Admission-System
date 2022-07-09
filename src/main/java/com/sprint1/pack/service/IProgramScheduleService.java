package com.sprint1.pack.service;

import java.util.Date;
import java.util.List;

import com.sprint1.pack.model.ProgramScheduled;

public interface IProgramScheduleService {
	public ProgramScheduled addProgramSchedule(ProgramScheduled programSchedule);
	public List<ProgramScheduled> viewAllProgramScheduleDetails();
	public List<ProgramScheduled> getProgramScheduleByCollegeName(String collegeName);
	public List<ProgramScheduled> getProgramScheduleByDate(String startDate);
	public int deleteProgramScheduleById(int scheduleId);
	public ProgramScheduled getProgramScheduleById(int scheduledId);
	public int updateProgramSchedule(ProgramScheduled ProgramScheduleId);

}
