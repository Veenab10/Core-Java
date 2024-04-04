package com.xworkz.example_interface.rules;

public interface ElectionRule {
	String ELECTION_NAME = "MLAElection";

	int votingAge();

	String votingProcess();

	String pollingPlace();

	boolean campigning();

	long votingCount();

}
