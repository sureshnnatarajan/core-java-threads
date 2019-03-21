package com.suresh.learnings.twentynineteen.march;

public class BuildingContractorRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Running Thread Name ==>" + Thread.currentThread().getName());
	}

}
