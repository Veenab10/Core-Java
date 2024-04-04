package com.xworkz.example_interface.admin;

import com.xworkz.example_interface.rules.ExamRule;

public class ExamAdmin {
	private ExamRule examRule;

	public ExamAdmin(ExamRule examRule) {
		this.examRule = examRule;
	}

	public void hallTicket() {
		if (examRule != null)

		{
			boolean ht = examRule.hallTicket();
			if (ht == false) {
				boolean res = examRule.hallTicket();
				System.out.println(res);
			}
		} else {
			System.err.println("Invalid HallTicket");
		}
	}

	public void invigilator() {
		if (examRule != null) {
			String name = examRule.invigilator();
			System.out.println("Invigilator="+name);
		} else {
			System.err.println("invigilator is not present");
		}
	}

	public void duration() {
		if (examRule != null) {
			double timing = examRule.duration();
			System.out.println("Duration:" + timing);
		} else {
			System.err.println("Exam Timing is not mentioned");
		}
	}

}
