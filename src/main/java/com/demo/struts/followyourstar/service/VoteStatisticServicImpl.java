package com.demo.struts.followyourstar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.struts.followyourstar.service.dtos.ContestantVoteDTO;

@Service
public class VoteStatisticServicImpl implements VoteStatisticServic {

	@Override
	public int numberOfVotesPerCandidate(long candidateId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ContestantVoteDTO> getTopTenContestent(long eventid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContestantVoteDTO topContaistantOfAEvent(long eventid) {
		// TODO Auto-generated method stub
		return null;
	}

}
