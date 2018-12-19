public class VolatileNotAtomic {
	private static volatile long count = 0L;
	private static final int NUMBER = 10000;

	public static void main(String[] args) {
		Thread substractThread = new SubstractThread();
		substractThread.start();

		for (int i=0; i< NUMBER; i++) {
			synchronized (VolatileNotAtomic.class) {
				count++;
			}
		}

		while (substractThread.isAlive()){
		
		}

		System.out.println("count = " + count);
	}
	private static class SubstractThread extends Thread {
		@Override
		public void run() {
			for (int i =0;i<NUMBER;i++) {
				synchronized (VolatileNotAtomic.class) {
					count--;
				}
			}
		}
	}

}

