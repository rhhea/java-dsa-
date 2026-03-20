package oops;
//types of constructors
public class UseStudent {
    public static void main(String[] args) {
        Student s1 = new Student();   //default constructor called
        Student s2 = new Student("John", 101);  
        s2.marks[0] = 90; // setting marks for s2
        s2.marks[1] = 85;   // setting marks for s2
        s2.marks[2] = 88;   // setting marks for s2 //parameterized constructor called
        Student s3 = new Student(s2);  //copy constructor called
        s2.marks[2] = 95; // changing marks for s2
        for(int i = 0;i<3;i++)
         System.out.println(s3.marks[i]); // marks of s3 will be same as s2's marks but it should't change when s2's marks are changed because we are using copy constructor
    }}
    class Student{
        private String name;
        private int rollno;
        int marks[];
        Student(){
            System.out.println("Default constructor called");
            marks = new int[3];

        }
        //parameterized constructor
        Student(String name, int rollno){ 
            marks = new int[3]; // initializing marks array
            this.name = name;
            this.rollno = rollno;
            System.out.println("Parameterized constructor called");
        }
        //copy constructor
        Student(Student s){
            this.name = s.name;
            this.rollno = s.rollno;
            System.out.println("Copy constructor called");
            marks = new int[3];
            //this.marks = s.marks; // idhar sirf obj ka reference copy ho raha hai i.e. base address of marks arryar for s2 is same as that of s3
            for(int i = 0; i < s.marks.length; i++) {
                this.marks[i] = s.marks[i]; // copying each element of marks array
            }
        }
    }

