package com.xworkz.example_interface.rules;

public class MLAElectionRuleImpl  implements ElectionRule{

	@Override
	public int votingAge() {
		System.out.println("voting Age");
		int age=15;
		return age;
	}

	@Override
	public String votingProcess() {
	System.out.println("Voting Process");
	String process="electronic";
		return process;
	}

	@Override
	public String pollingPlace() {
		System.out.println("Polling place for voting");
		String place="Banglore";
		return place;
	}

	@Override
	public boolean campigning() {
		System.out.println("Adverstining for voting");
		boolean camp=true;
		return camp;
	}

	@Override
	public long votingCount() {
		System.out.println("Voting Count");
		long count=2000l;
		return count;
	}

}
