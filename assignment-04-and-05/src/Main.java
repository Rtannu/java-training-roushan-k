public class Main {
    public static void main(String[] args) {

        // Question 1
        Phone phone=new Phone();
        phone.displayAndroid();
        phone.displayApple();

        // Question 2
        ChildClass childClass=new ChildClass(1,2);
        System.out.println("Parent Class Var = "+childClass.getParentVar());
        System.out.println("Child Class Var = "+childClass.getChildVar());

        // Question 3
        System.out.println("Static Variable = "+StaticMtdVarClass.getClassVar());

        // Question 4
        FinalClass finalClass=new FinalClass();
        System.out.println("Final Class Var = "+finalClass.getFINAL_VAR());
    }
}