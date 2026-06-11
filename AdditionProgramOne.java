// Duplicate methods (all static methods) in Java	
package module1.programs;
public class AdditionProgramOne 
{
        static void add(int a,int b)    //local variable
        {
                int c=a+b;//local variable
                System.out.println(c);
        }
        static void add(int a,double b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
        static void add(double a,int b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
        static void add(double a,double b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
        public static void main(String[] args) 
        {
                add(3.6,5.9);
                add(3,5.9);
                add(3.6,5.9);
                add(3,5);
        }
        
}
       