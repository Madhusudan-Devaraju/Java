package cla;

public class CommLineArgs {

	public static void main(int[] args) {

		System.out.println("The square of " + args[0] + " is " + args[0] * args[0]);
	}

	public static void main(String[] args) {
		main(new int[] { 3 });
	}
}
