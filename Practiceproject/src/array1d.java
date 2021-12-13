
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class array1d {

	public static void main(String[] args) {
		Integer[] ab = { 22, 10, 8, 7, 1, 1, 3, 3, 4, 4, 6, 2, 44 };

		String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };

		String[] array2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

		/*
		 * printarray(ab, 2); addition(ab); largest(ab); smallest(ab);
		 * findoccurance(ab,4); sortArrayUsingSortMethod(ab);
		 * sortArrayDesendingOrderUsingSortMethod(ab);
		 */
		// sortArray(ab);
		/*
		 * sortDecendingArray(ab); printCompletearray(ab); sum(ab); average(ab);
		 * findindex(ab,44); removeElement(ab,2); copyArray(ab);
		 * commonintwoarray(array1, array2);
		 */
		sumisspecificvalue(ab, 8);
	}

	public static void addition(Integer[] ab) {
		int sum = 0;
		for (int i = 0; i < ab.length; i++) {
			sum = sum + ab[i];
		}
		System.out.println("Sum of integer values = " + sum);
	}

	public static void printarray(Integer[] ab, int noofelement) {

		System.out.println(ab[noofelement]);
	}

	public static void printCompletearray(Integer[] ab) {

		System.out.println(Arrays.toString(ab));
	}

	public static void largest(Integer[] ab) {

		int max = ab[0];
		for (int i = 0; i < ab.length; i++) {
			if (ab[i] > max) {
				max = ab[i];
			}
		}
		System.out.println("largest number in array is " + max);
	}

	public static void smallest(Integer[] ab) {

		int min = ab[0];
		for (int i = 0; i < ab.length; i++) {
			if (min > ab[i]) {
				min = ab[i];
			}
		}
		System.out.println("smallest no is= " + min);
	}

	public static void findoccurance(Integer[] ab, int n) {
		int count = 0;
		for (int a : ab) {
			if (a == n) {
				count++;
			}
		}
		System.out.println("Count of element " + n + " is = " + count);
	}

	public static void sortArray(Integer[] ab) {
		int temp = 0;
		for (int i = 0; i < ab.length; i++) {
			for (int j = i + 1; j < ab.length; j++) {
				if (ab[i] > ab[j]) {
					temp = ab[i];
					ab[i] = ab[j];
					ab[j] = temp;
				}
			}

		}
		System.out.println("Sort plz" + Arrays.toString(ab));

	}

	public static void sortDecendingArray(Integer[] ab) {
		int temp = 0;
		for (int i = 0; i < ab.length; i++) {
			for (int j = i + 1; j < ab.length; j++) {
				if (ab[i] < ab[j]) {
					temp = ab[i];
					ab[i] = ab[j];
					ab[j] = temp;
				}
			}
		}
		System.out.println("Sort in decending plz" + Arrays.toString(ab));
	}

	public static void sortArrayUsingSortMethod(Integer[] ab) {
		Arrays.sort(ab);
		System.out.println(Arrays.toString(ab));
	}

	public static void sortArrayDesendingOrderUsingSortMethod(Integer[] ab) {
		Arrays.sort(ab, Collections.reverseOrder());
		System.out.println(Arrays.toString(ab));
	}

	public static void sum(Integer[] ab) {
		int sum = 0;
		for (int no : ab) {
			sum = sum + no;
		}
		System.out.println(sum);
	}

	public static void average(Integer[] ab) {
		int sum = 0;
		for (int no : ab) {
			sum = sum + no;
		}
		System.out.println(ab.length);
		double avg = sum / ab.length;
		System.out.println("average of array is = " + avg);
	}

	public static void findindex(Integer[] ab, int a) {
		int i = 0;
		while (i < ab.length) {
			if (ab[i] == a)
				System.out.println("index of " + a + " is= " + i);
			i++;
		}
	}

	public static void removeElement(Integer[] ab, int index) {
		System.out.println("Actual array = " + Arrays.toString(ab));
		for (int i = 0; i < ab.length; i++) {
			ab[index] = ab[index + 1];
		}
		System.out.println("Aarray after removing value = " + Arrays.toString(ab));
	}

	public static void copyArray(Integer[] ab) {
		Integer[] newarray = new Integer[ab.length];
		System.out.println("new array default value = " + Arrays.toString(newarray));
		for (int i = 0; i < ab.length; i++) {
			newarray[i] = ab[i];
		}

		System.out.println("new array value after copy = " + Arrays.toString(newarray));
	}

	public static void commonintwoarray(String[] ab, String[] cd) {
		HashSet<String> seet = new HashSet<String>();
		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < cd.length; j++) {
				if (ab[i] == cd[j]) {
					seet.add(ab[i]);
				}
			}
		}

		System.out.println("commin strings are" + seet);
	}

	public static void sumisspecificvalue(Integer[] ab, int no) {

		for (int i = 0; i < ab.length; i++) {
			for (int j = i + 1; j < ab.length; j++)

			{
				if (ab[i] + ab[j] == no) {
					System.out.println("sum of " + ab[i] + "and " + ab[j] + " is =" + no);
				}
			}
		}

	}
}