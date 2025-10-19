Import java.util.Scanner;

Public class StudentDetails {
Public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Student basic details
System.out.print(“Enter Name: “);
String name = sc.nextLine();

System.out.print(“Enter RRN: “);
String rrn = sc.nextLine();

System.out.print(“Enter CGPA: “);
Double cgpa = sc.nextDouble();

System.out.print(“Enter Age: “);
Int age = sc.nextInt();

System.out.print(“Enter Phone Number: “);
Long phone = sc.nextLong();

// Subject grades
System.out.print(“Enter grade in Physics: “);
String physicsGrade = sc.next();

System.out.print(“Enter grade in Maths: “);
String mathsGrade = sc.next();

System.out.print(“Enter grade in Chemistry: “);
String chemistryGrade = sc.next();

// Displaying the information
System.out.println(“\n--- Student Details ---“);
System.out.println(“Name: “ + name);
System.out.println(“RRN: “ + rrn);
System.out.println(“CGPA: “ + cgpa);
System.out.println(“Age: “ + age);
System.out.println(“Phone Number: “ + phone);
System.out.println(“Physics Grade: “ + physicsGrade);
System.out.println(“Maths Grade: “ + mathsGrade);

System.out.println(“Chemistry Grade: “ + chemistryGrade);

Sc.close();
}
}



