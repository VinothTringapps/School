package org.example;


import java.util.Scanner;

public class School {

    String studentName;
    String grade;
    double gradePoints;

    Scanner sc=new Scanner(System.in);

    School(String name,String grade,double gradePoints){
        this.studentName=name;
        this.grade=grade;
        this.gradePoints=gradePoints;
    }
    public void display(){
        System.out.println(this.studentName+" has a "+this.gradePoints+" GPA");
    }
    public void update(){
        System.out.println("Enter the Number of Subject :");
        int n=sc.nextInt();
        Double gpa=0.0;

        String[] a=new String[n];
        sc.nextLine();

        System.out.println("A/B/C/D/E/F");
        for (int i=0;i<n;i++){
            System.out.println("Enter the Grade for subject "+(i+1)+" :");
            a[i]=sc.nextLine();
            gpa +=gradeCal(a[i]);
        }
        if(gpa>23 ){
            grade="A";
            gradePoints=5.0;
        } else if (gpa>20) {
            grade="B";
            gradePoints=4.5;
        } else if (gpa>18) {
            grade="C";
            gradePoints=4.0;
        } else if (gpa>15) {
            grade="D";
            gradePoints=3.5;
        }
        else if(gpa>10) {
            grade="E";
            gradePoints=3.0;
        }
        else {
            grade="F";
            gradePoints=2.5;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        School s=new School(null,null,0);
        String name;
        String grade;
        double gradePoints;
        System.out.println("Enter the Name :");
        name=sc.nextLine();
        System.out.println("Enter the Number of Subject :");
        int n=sc.nextInt();
        Double gpa=0.0;

        String[] a=new String[n];
        sc.nextLine();

        System.out.println("A/B/C/D/E/F");
        for (int i=0;i<n;i++){
            System.out.println("Enter the Grade for subject "+(i+1)+" :");
            a[i]=sc.nextLine();
            gpa += s.gradeCal(a[i]);
        }
        System.out.println("GPA :" +gpa);
        if(gpa>23 ){
            grade="A";
            gradePoints=5.0;
        } else if (gpa>20) {
            grade="B";
            gradePoints=4.5;
        } else if (gpa>18) {
            grade="C";
            gradePoints=4.0;
        } else if (gpa>15) {
            grade="D";
            gradePoints=3.5;
        }
        else if(gpa>10) {
            grade="E";
            gradePoints=3.0;
        }
        else {
            grade="F";
            gradePoints=2.5;
        }

        School s1=new School(name,grade,gradePoints);

        while (true){
            int choice;
            System.out.println("1.display /n 2.Update");
            choice=sc.nextInt();
            switch (choice) {
                case 1 -> s1.display();
                case 2 -> s1.update();
                default -> System.out.println("Wrong Choice !");
            }

        }
    }
    private Double gradeCal(String s) {
        if (s.equalsIgnoreCase("A")) {
            return  gradePoints = 5.0;
        } else if (s.equalsIgnoreCase("B")) {
            return gradePoints = 4.5;
        } else if (s.equalsIgnoreCase("C")) {
            return gradePoints = 4.0;
        } else if (s.equalsIgnoreCase("D")) {
            return gradePoints = 3.5;
        } else if (s.equalsIgnoreCase("E")) {
            return gradePoints = 3.0;
        }
        return gradePoints = 2;
    }



}
