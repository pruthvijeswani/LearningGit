// Duplicate methods in Java with static & non-static methods
package module1.programs;
public class AdditionProgramOne_StaticNonStatic 
{
        static void add(int a,int b)    //local variable
        {
                int c=a+b;//local variable
                System.out.println(c);
        }
         void add(int a,double b)//local variable
        {
                double c=a+b;//local variable
                System.out.println(c);
        }
         static void add(double a,int b)//local variable
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
                AdditionProgramOne_StaticNonStatic a1=new AdditionProgramOne_StaticNonStatic();
                a1.add(3.6,5.9);
                add(3.5,5);
                a1.add(3.6,5.9);
                add(3,5);

        }
}