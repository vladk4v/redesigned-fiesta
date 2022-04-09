package company;

@FunctionalInterface
public interface OnTaskErrorListener {
	void onError(int error);
}
