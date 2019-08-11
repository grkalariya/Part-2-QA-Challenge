package com.helloworldasync;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	static int count1 = 0;
	static int count2 = 0;

	public static void main(String[] args) {
		int intervalInSeconds = 10;
		int totalExecutionTimeInSeconds = 60;
		int totalCount = Math.round(totalExecutionTimeInSeconds/intervalInSeconds);
		
		System.out.println("Starting threads upto "+totalCount+" iterations...");
		HelloWorld hw = new HelloWorld();
		
		// Creating Runnable tasks for each function
		Runnable periodicTask1 = new Runnable() {
			public void run() {
				hw.printHello();
			}
		};

		Runnable periodicTask2 = new Runnable() {
			public void run() {
				hw.printWorld();
			}
		};
		
		// Scheduling tasks for execution every 10 seconds
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
		scheduledExecutorService.scheduleAtFixedRate(periodicTask1, 0, intervalInSeconds, TimeUnit.SECONDS);
		scheduledExecutorService.scheduleAtFixedRate(periodicTask2, 0, intervalInSeconds, TimeUnit.SECONDS);
		
		while (true) {
			try {
				Thread.sleep(1000);
				if (count1 >= totalCount) {
					//System.out.println("Shutting down...");
					scheduledExecutorService.shutdown();
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
