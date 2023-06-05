public class StaticMtdVarClass {

    static  int classVar;

    static {
        classVar=100;
    }
    public static int getClassVar() {
        return classVar;
    }
}
