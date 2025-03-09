package Assignments.FirstSemester.Assignment7;
import java.util.Random;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] arr = null;
		boolean exit = false;
		int size = 0;
		while (!exit) {
			System.out.println("-=-=-=-=-Array-=-=-=-=-");
			System.out.println("1. Create an array of N integers");
			System.out.println("2. Display the array elements");
			System.out.println("3. Insert an element at specific position");
			System.out.println("4. Delete an element at a given position");
			System.out.println("5. Exit");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.print("Options (1-5): ");
			int choice = sc.nextInt();
			while (!(choice > 0 && choice < 6)) {
				System.out.println("Wrong Input");
				System.out.print("Options (1-5): ");
				choice = sc.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.print("Enter the size of list: ");
				size = sc.nextInt();
				while (size < 1) {
					System.out.println("The array size must be a positive integer.");
					System.out.print("Enter the size of list: ");
					size = sc.nextInt();
				}
				arr = new int[size];
				// Can switch for manual insertion but for this imma use the random generation.
				System.out.println("Generating random numbers into the array...");
				System.out.print("Randomly Generated Array: [");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = rand.nextInt(100);
					System.out.print(arr[i] + (i == arr.length - 1 ? "]" : ", "));
				}
				System.out.println();
				break;
			case 2:
				// Display elements
				if (arr == null) {
					System.out.println("The Array hasn't been created yet. Please create an Array first.");
				} else {
					System.out.print("Current Array: [");
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + (i == arr.length - 1 ? "]" : ", "));
					}
					System.out.println();
				}
				break;
			case 3:
				// Insert element
				if (arr == null) {
					System.out.println("The Array hasn't been created yet. Please create an Array first.");
				} else {
					System.out.print("Enter the index of the new element (0-" + (size) + ")");
					int newindex = sc.nextInt();
					while (!(newindex > -1 && newindex < size + 1)) {
						System.out.println("Wrong Index!");
						System.out.print("Enter the index of the new element (0-" + (size) + ")");
						newindex = sc.nextInt();
					}
					System.out.print("Enter the new element: ");
					int newelement = sc.nextInt();
					size++;
					int[] newarray = new int[size];

					for (int i = 0; i < size; i++) {
						if (i == newindex) {
							newarray[i] = newelement;
						} else {
							if (i < newindex) {
								newarray[i] = arr[i];
							} else {
								newarray[i] = arr[i - 1];
							}
						}
					}

					arr = newarray;
					System.out.println("Element successfully was inserted!");
				}
				break;
			case 4:
				// Delete Element
				if (arr == null) {
					System.out.println("The Array hasn't been created yet. Please create an Array first.");
				} else {
					System.out.print("Enter the index of the element (0-" + (size - 1) + ") to delete: ");
					int deleteindex = sc.nextInt();
					while (!(deleteindex > -1 && deleteindex < size)) {
						System.out.println("Wrong Index!");
						System.out.print("Enter the index of the element (0-" + (size - 1) + ") to delete: ");
						deleteindex = sc.nextInt();
					}
					size--;
					int[] newarray = new int[size];
					for (int i = 0; i < size; i++) {
						if (i < deleteindex) {
							newarray[i] = arr[i];
						} else {
							newarray[i] = arr[i + 1];
						}
					}
					arr = newarray;
					System.out.println("Element successfully was inserted!");
				}
				break;
			case 5:
				System.out.println("Exiting Program...");
				exit = true;
				break;
			}

		}
		sc.close();
	}

}
