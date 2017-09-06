package Arrays;

/**
 * AbstractClass:
 *
 * https://www.youtube.com/watch?v=mf0jQijo9C4
 *
 * What is Abstraction in OOPS:
 * Abstraction is a process of hiding the implementation details from the user,
 * only the functionality will be provided to the user. In other words,
 * the user will have the information on what the object does instead
 * of how it does it.
 *
 *
 * Abstract class should contains atleast one abstract method then only we
 * can declared it as abstract class.
 *
 */
public class AbstractClass {

    public static void main(String[] args) {
        Bank obj = new BoFA();
        obj.deposit();
        obj.withdraw();
        obj.interestCalculation(1000);
        Bank objChase = new Chase();
        objChase.deposit();
        objChase.withdraw();
        objChase.interestCalculation(100);
    }
}


    abstract class Bank{

        public void deposit(){
            System.out.println("From base class");
        }

        public void withdraw(){
            System.out.println("From base class");
        }

        abstract public void interestCalculation(int value);
    }

    class BoFA extends Bank{
        @Override
        public void interestCalculation(int value) {
            System.out.println("From BoFA class");
        }
    }

    class Chase extends Bank {

        @Override
        public void interestCalculation(int value) {
            System.out.println("From Chase class");
        }
    }

