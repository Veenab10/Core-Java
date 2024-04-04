package com.xworkz.example_interface.rules;

public class SSLExamRulesImpl implements ExamRule {

	@Override
	public boolean hallTicket() {
		System.out.println("Should have Exam HallTicket");
		boolean res=false;
		return res;
	}

	@Override
	public String invigilator() {
		System.out.println("Running invigilator method");
		String name="Suhas";
		return name ;
	}

	@Override
	public double duration() {
		System.out.println("Exam Duration");
		double duration=3;
		return duration;
	}
	

}
