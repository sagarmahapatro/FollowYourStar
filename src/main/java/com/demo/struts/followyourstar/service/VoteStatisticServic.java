package com.demo.struts.followyourstar.service;

import java.util.List;

import com.demo.struts.followyourstar.service.dtos.ContestantVoteDTO;

public interface VoteStatisticServic {
	
	int numberOfVotesPerCandidate(long candidateId);
	List<ContestantVoteDTO> getTopTenContestent(long eventid);
	ContestantVoteDTO topContaistantOfAEvent(long eventid);

}
