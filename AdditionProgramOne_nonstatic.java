// Duplicate methods in Java with non-static methods 
 	
package module1.programs;
public class AdditionProgramOne_nonstatic 
{
         void add(int a,int b)    //local variable
        {
                int c=a+b;//local variable
                System.out.println(c);
        }
         void add(int a,double b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
         void add(double a,int b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
         void add(double a,double b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
        public static void main(String[] args) 
        {
                AdditionProgramOne_nonstatic a1=new AdditionProgramOne_nonstatic();
                a1.add(3.6,5.9);
                a1.add(3,5.9);
                a1.add(3.6,5.9);
                a1.add(3,5);

        }
}