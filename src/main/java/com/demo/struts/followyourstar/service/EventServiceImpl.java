package com.demo.struts.followyourstar.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.struts.followyourstar.persistent.daos.EventDAO;
import com.demo.struts.followyourstar.service.dtos.ContestantDTO;

@Service
public class EventServiceImpl implements EventService {

	public EventServiceImpl(){
		
	}
	@Override
	public EventDAO createEvent( String name, Date eventStartDate,
			Number duration) {
		// TODO Auto-generated method stub
     return null;
	}

	@Override
	public void addContestantsToEvent(String eventCode, String name,
			String describtion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enrollUserToAEvent(String userName, String eventCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ContestantDTO> getAllContestantsOfAEvent(String eventCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void castVote(String userName, String contestantName ,String eventCode) {
		// TODO Auto-generated method stub

	}
	
	 public List<EventDAO> searchForEventsByName(String name){
	  return null;	 
	 }
	 public  List<EventDAO> searchForEventsByLocation(String locationName) {
		 return null;	  
	 }
	 public  List<EventDAO> searchForEventsByContestant(String contestantName){
		 return null;	 
	 }

}
