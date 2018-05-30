package org.udlma.sample;

import org.springframework.scheduling.annotation.Scheduled;

public class Sample {
	
	public Sample() {
		
		System.out.println("왔다");
		
	}
	
	@Scheduled(cron ="0 * * * * *")
	public void test() {
		
		System.out.println("실행 실행 실행");
		
	}

}
