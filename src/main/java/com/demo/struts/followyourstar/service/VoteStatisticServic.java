package com.demo.struts.followyourstar.service;

import java.util.List;

import com.demo.struts.followyourstar.service.dtos.ContestantVoteDTO;
import com.demo.struts.followyourstar.service.dtos.EventDTO;

public interface VoteStatisticServic {
	
	int numberOfVotesPerCandidate(long candidateCode);
	List<ContestantVoteDTO> getTopTenContestent(long eventCode);
	ContestantVoteDTO topContaistantOfAEvent(long eventCode);
	EventDTO getEventWithHeightMemeberEnrolled(); 

}
