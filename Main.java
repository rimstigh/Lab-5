import java.util.ArrayList;

class Main {  public static void main(String[] args) {   
  Student student1 = new Student();    
  student1.setName("Arnold Spielberg");    
  student1.setGPA(4.0);    
  student1.setMajor("Electrical Engineering");
  
  //Print out student1's information
  student1.print();

  //Create new student and input information
  Student student2 = new Student();
  student2.setName("Grant Rimstidt");
  student2.setGPA(4.3);
  student2.setMajor("Information Systems");

  //Print out student2's information
  student2.print();

  //Declare ArrayList for GPAs
  ArrayList<Double> gpas = new ArrayList<Double>();

  //Add student1's GPA to the ArrayList
  gpas.add(student1.getGPA());

  //Add student2's GPA to the ArrayList
  gpas.add(student2.getGPA());

  //Calculate the average:
  //declare / initialize variable to keep track of sum
  double sum = 0.0;

  //Loop the ArrayList of GPAs, and add each GPA to sum in body of loop
  for (int i = 0; i < gpas.size(); i++) {
    sum += gpas.get(i);
  }

  //System.out.println() to calculate and show average, using sum and size of ArrayList
  System.out.println("The average GPA is " + sum / gpas.size());
  }
}