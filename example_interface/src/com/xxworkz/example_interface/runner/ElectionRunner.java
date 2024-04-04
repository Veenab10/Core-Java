package com.xxworkz.example_interface.runner;

import com.xworkz.example_interface.admin.ElectionAdmin;
import com.xworkz.example_interface.rules.ElectionRule;
import com.xworkz.example_interface.rules.MLAElectionRuleImpl;

public class ElectionRunner {
	public static void main(String[] args) {
		ElectionRule rule=new MLAElectionRuleImpl();
		
		ElectionAdmin admin=new ElectionAdmin(rule);
		admin.votingAge();
		admin.votingProcess();
		admin.campigning();
		admin.pollingPlace();
		admin.votingCount();
		
	}
	
	


}
