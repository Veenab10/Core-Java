package com.xxworkz.example_interface.runner;

import com.xworkz.example_interface.admin.ExamAdmin;
import com.xworkz.example_interface.rules.ExamRule;
import com.xworkz.example_interface.rules.SSLExamRulesImpl;

public class ExamRunner {
	
	public static void main(String[] args) {
		ExamRule exam=new SSLExamRulesImpl();
		
		ExamAdmin admin=new ExamAdmin(exam);
		admin.hallTicket();
		admin.invigilator();
		admin.duration();
	}

}
