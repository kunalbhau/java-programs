// java program to define a class and describe its define 
//its constructor and overload the constructor and instantiate
 //its objects

import java.util.*;

class student
{
string name;
int regno;
int marks1;
int marks2;
int marks3;
// null constructor//

student ()
{
   name= "raju";
   regno= 12345;
   marks1=56;
   marsk 2= 47;
   marks 3=78;

}
// parameterized constructor //

student (String n, int r, int m1, int m2, int m3)
{
   name = n;
   regno =r;
   m1= marks1;
   marks2= m2;
   marks3= m3;

}
// copy constructor //
student(studnet s)
{
name= s.name;
marks1= s.marks1;
marks2= s.marks2;
marks3= s.marks3;
regno= s.regno;

}

void display()
{
   system.out.println(name + "\t" + regno + "\t" +marks1 +"\t"+
   marks2 + "\t"+ marks3 +"\t" );
}

classstudentdemo{
   public static void main (string arg[])
   {
      student s1 = new student ();
      student s2 = new student ("john" 34266, 58, 96, 84);
      student s3= new student(s1);
      s1.display();
      s2.display();
      s3.display();

   }

}

}