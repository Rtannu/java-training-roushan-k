package rtn.day4and5.assignment4and5;

public class StaticMtdVarClass {

    static  int classVar;

    static {
        classVar=100;
    }
    public static int getClassVar() {
        return classVar;
    }
}
