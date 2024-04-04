package com.xworkz.example_interface.admin;

import com.xworkz.example_interface.rules.ElectionRule;

public class ElectionAdmin {
	private ElectionRule electionRule;
	
	public ElectionAdmin(ElectionRule electionRule) {
		this.electionRule=electionRule;
		
	}
	
	public void votingAge()
	{
		if(electionRule!=null)
		{
			
			int votingAge=electionRule.votingAge();
			if(votingAge>=18) {
			System.out.println("Voting Age:"+votingAge);
			}
		
		else {
			System.err.println("Not Eligiable for voting");
		}
		}
				
	}
	public void votingProcess()
	{
		if(electionRule!=null)
		{
			String process=electionRule.votingProcess();
			System.out.println("Voting Process:"+process);
		}
		else {
			System.err.println("This is not digital process");
		}
	}
	public void pollingPlace()
	{
		if(electionRule!=null) {
			String place=electionRule.pollingPlace();
			System.out.println("PollingPlace:"+place);
		}
		else {
			System.err.println("Invalid Polling place");
		}
	}
	public void campigning()
	{
		if(electionRule!=null) {
			boolean campigning=electionRule.campigning();
			System.out.println("campigning:"+campigning);
		}
		else {
			System.err.println("Invalid campigning");
		}
	}
	public void votingCount()
	{
		if(electionRule!=null)
		{
			long vcount=electionRule.votingCount();
			System.out.println("Voting Count:"+vcount);
		}
		else {
			System.out.println("Invalid voting count");
		}
		
	}

}
