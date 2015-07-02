package com.demo.struts.followyourstar.service;

import java.util.Date;
import java.util.List;

import com.demo.struts.followyourstar.persistent.daos.EventDAO;
import com.demo.struts.followyourstar.service.dtos.ContestantDTO;

public interface EventService {
		
	EventDAO createEvent(String name,Date eventStartDate,Number duration);
	void addContestantsToEvent(String eventCode,String name, String describtion);
    void enrollUserToAEvent(String userName, String eventCode);
    List<ContestantDTO> getAllContestantsOfAEvent(String eventCode);
    void castVote(String userName, String contestantName ,String eventCode);
    
    List<EventDAO> searchForEventsByName(String name);
    List<EventDAO> searchForEventsByLocation(String locationName);
    List<EventDAO> searchForEventsByContestant(String contestantName);
}
