public class PersonAge {

    static String checkAge(int age){
        if(age<13){
            return "teen";
        }else if(age>=13 && age<=19){
            return "kid";
        }else return "adult";
    }
}
