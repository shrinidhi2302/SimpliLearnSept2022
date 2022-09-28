package Mypackage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Projectphase1 {
	public static void main(String[] args) throws IOException {
		System.out.println("*********WELCOME************ \n"
				+ "Application Name: Virtual Key Repository\n"+
				"***********DEVELOPERS DETAILS*********** \n"+
				"Name: Shrinidhi K \n" +
				"Designtion: JAVA Developer \n");
		
		while(true) {
			System.out.println("Enter 1: Get File Name In Ascending Order\n"+
					"Enter 2: For Operations\n"+
					"Enter 3: Close The Application");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			
			if (option == 1) {
				File file = new File("C:\\Users\\Shrinidhi\\Desktop\\Phase1");
				String[] children = file.list();
				Arrays.sort(children);
				for(int i=0; i<children.length; i++) {
					String filename = children[i];
					System.out.println(filename);
				}
			} else if(option ==2) {
				System.out.println("Enter 1: Add File\n" +
						"Enter 2: Delete File\n"+
						"Enter 3: Search File\n"+
						"Enter 4: Go Back");
				int input = scanner.nextInt();
				switch(input) {
					case 1: 
						System.out.println("Enter your File Name");
						Scanner scanner1 = new Scanner(System.in);
						String name = scanner1.nextLine();
						File file = new File ("C:\\Users\\Shrinidhi\\Desktop\\Phase1" + name);
						if(file.createNewFile()) {
							System.out.println("File is created");
						} else {
							System.out.println("File already exists");
						}
						break;
					case 2:
						System.out.println("Enter file name for delete");
						Scanner scanner2 =new Scanner(System.in);
						String name1 = scanner2.nextLine();
						File file1 = new File("C:\\Users\\Shrinidhi\\Desktop\\Phase1" + name1);
						if(file1.delete())
							System.out.println("File is deleted");
						else
							System.out.println("File is not deleted or fie is not found");
						break;
					case 3:
						System.out.println("Enter file name to search");
						Scanner scanner3 =new Scanner(System.in);
						String fileName = scanner3.nextLine();
						File file2 = new File("C:\\Users\\Shrinidhi\\Desktop\\Phase1" + fileName);
						if(file2.exists())
						{
							System.out.println("File is available");
						}
						else {
							System.out.println("File is not available");
						}
					case 4:
						System.out.println("Going to back menu");
						break;
					default:
						System.out.println("Please enter a valid one");
				}
			}
			if (option ==3) {
				System.exit(option);
				System.out.println("Exited Successfully");
			}
		}
		
	}

}
