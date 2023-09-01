import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		play();
	}

	private static void play() {
		String choice;
		do {
			System.out.println("!!###########################################################!!");
			System.out.println("!!                                                           !!");
			System.out.println("!!....    Codesoft Task 2 - Student Grade Calculator     ....!!");
			System.out.println("!!                                                           !!");
			System.out.println("!!###########################################################!!");
			System.out.println("");
			System.out.print("Enter Your Subject_1 Marks out of 100 : ");
			Scanner sc = new Scanner(System.in);
			float sub1 = sc.nextFloat();
			System.out.print("Enter Your Subject_2 Marks out of 100 : ");
			float sub2 = sc.nextFloat();
			System.out.print("Enter Your Subject_3 Marks out of 100 : ");
			float sub3 = sc.nextFloat();
			System.out.print("Enter Your Subject_4 Marks out of 100 : ");
			float sub4 = sc.nextFloat();
			System.out.print("Enter Your Subject_5 Marks out of 100 : ");
			float sub5 = sc.nextFloat();
			System.out.print("Enter Your Subject_6 Marks out of 100 : ");
			float sub6 = sc.nextFloat();
			float total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
			System.out.println("");
			System.out.print("Your Obtained Total Marks Is  : " + total + "/600");
			float per = (total / 600) * 100;
			System.out.println("");
			System.out.print("Your Obtained Percentage Is  : " + per + "%");
			System.out.println("");
			if (per >= 90 && per <= 100) {
				System.out.println("Your Obtained Grade Is : A+");
			} else if (per >= 80 && per < 90) {
				System.out.println("Your Obtained Grade Is : A");
			} else if (per >= 60 && per < 80) {
				System.out.println("Your Obtained Grade Is : B");
			} else if (per >= 45 && per < 60) {
				System.out.println("Your Obtained Grade Is : C");
			} else if (per >= 35 && per < 45) {
				System.out.println("Your Obtained Grade Is : D");
			} else {
				System.out.println("You Are Failed ..... Try Again Next Year ");
			}
			System.out.print("Want To Calculate Another Result (y/n) ? ");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Good Luck For Your Next Year");
	}

}
