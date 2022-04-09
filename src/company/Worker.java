package company;

public class Worker {
	private OnTaskDoneListener callback;
	private OnTaskErrorListener errorCallback;
	private int j = 33;


	public Worker(OnTaskDoneListener callback) {
		this.callback = callback;
		errorCallback = x -> System.out.printf("Task #%d is failed \n", j);
	}

	public void start() {
		for (int i = 0; i < 100; i++) {
			if (i != j) {
				callback.onDone("Task #" + i + " is done");
			} else {
				errorCallback.onError(i);
			}
		}
	}
}
