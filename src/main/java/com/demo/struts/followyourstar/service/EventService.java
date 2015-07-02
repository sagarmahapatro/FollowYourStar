package com.demo.struts.followyourstar.service;

import java.util.Date;
import java.util.List;

import com.demo.struts.followyourstar.service.dtos.ContestantDTO;

public interface EventService {
	
	void createEvent(long userid, String name,Date eventStartDate,Number duration);
	void addContestantsToEvent(long eventId,String name, String describtion);
    void enrollUserToAEvent(long userid, long eventid);
    List<ContestantDTO> getAllContestantsOfAEvent(long eventid);
    void castVote(long userid, long Contestantid );
}
