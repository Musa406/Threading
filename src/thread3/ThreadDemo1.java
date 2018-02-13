package thread3;

public class ThreadDemo1 extends Thread{
	
	private String threadName;
	private int initialValue;
	private int adder;
	private boolean isAliveFlag;
	private int counter;
	
	ThreadDemo1(int initialValue, int adder, String threadName, boolean isAliveFlag) {
		
		this.setInitialValue(initialValue);
		this.setAdder(adder);
		this.setThreadName(threadName);
		this.setAliveFlag(isAliveFlag);
		//this.setCounter(counter);
	}

	public void run(){
		counter = initialValue;
		//counter+= adder;
		while(isAliveFlag) {
			counter = counter + adder;
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	public void stopThread() {
		isAliveFlag = false;
	}
	
	public void resumeThread() {
		System.out.println("resume ok...");
		isAliveFlag = true;
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}

	public boolean isAliveFlag() {
		return isAliveFlag;
	}

	public void setAliveFlag(boolean isAliveFlag) {
		this.isAliveFlag = isAliveFlag;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public int getAdder() {
		return adder;
	}

	public void setAdder(int adder) {
		this.adder = adder;
	}
}
