package com.suresh.learnings.twentynineteen.march;

public class PracticeThread {

	public static void main(String[] args) {
		System.out.println("Running Thread Name ==>" + Thread.currentThread().getName());
		BuildingContractorRunnable runnable = new BuildingContractorRunnable();
		Thread workerThread = new Thread(runnable);
		workerThread.start();
		
		Thread mason = new Thread(runnable);
		mason.setName("Mason");
		mason.start();
		
		Thread plumber = new Thread(runnable);
		plumber.setName("Plumber");
		plumber.start();
		
		Thread electrician = new Thread(runnable);
		electrician.setName("Electrician");
		electrician.start();
	}

}
