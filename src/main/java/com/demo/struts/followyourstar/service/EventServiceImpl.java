package com.demo.struts.followyourstar.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.struts.followyourstar.service.dtos.ContestantDTO;

@Service
public class EventServiceImpl implements EventService {

	public EventServiceImpl(){
		
	}
	@Override
	public void createEvent(long userid, String name, Date eventStartDate,
			Number duration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addContestantsToEvent(long eventId, String name,
			String describtion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enrollUserToAEvent(long userid, long eventid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ContestantDTO> getAllContestantsOfAEvent(long eventid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void castVote(long userid, long Contestantid) {
		// TODO Auto-generated method stub

	}

}
