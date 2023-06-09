package rtn.day8.assignment8;

public class Main {
    public static void main(String[] args) {
        /*************************** Assignment 8  ****************************************************/
        System.out.println("************************************** Number of Vowels ********************************************");
        String input1 = "Rama";
        String input2 = "Shiva";
        String input3 = "India";
        String input4 = "HINDUSTAN";
        System.out.println("Number of Vowels in " + input1 + " is " + NumberOfVowels.findNumberOfVowels(input1));
        System.out.println("Number of Vowels in " + input2 + " is " + NumberOfVowels.findNumberOfVowels(input2));
        System.out.println("Number of Vowels in " + input3 + " is " + NumberOfVowels.findNumberOfVowels(input3));
        System.out.println("Number of Vowels in " + input4 + " is " + NumberOfVowels.findNumberOfVowels(input4));

        System.out.println("\n\n************************************** Check Anagram ********************************************");
        String inputAnagram1 = "final";
        String inputAnagram2 = "fnial";
        String inputAnagram3 = "rama";
        String inputAnagram4 = "ramm";
        String inputAnagram5 = "REPLY";
        String inputAnagram6 = "RPELY";
        System.out.println(inputAnagram1 + " and " + inputAnagram2 + " is anagram : " + Anagram.isAnagram(inputAnagram1, inputAnagram2));
        System.out.println(inputAnagram3 + " and " + inputAnagram4 + " is anagram : " + Anagram.isAnagram(inputAnagram3, inputAnagram4));
        System.out.println(inputAnagram5 + " and " + inputAnagram6 + " is anagram : " + Anagram.isAnagram(inputAnagram5, inputAnagram6));

        System.out.println("\n\n************************************** Reverse Each Word In Sentence ********************************************");
        System.out.print("Reverse of each word of 'Java J2EE Reverse Me' is ");
        System.out.println(Reverse.reverseEachWordInSentence("Java J2EE Reverse Me"));
        System.out.print("Reverse of each word of 'I am Java Developer' is ");
        System.out.println(Reverse.reverseEachWordInSentence("I am Java Developer"));
        System.out.print("Reverse of each word of 'I Know Spring Boot' is ");
        System.out.println(Reverse.reverseEachWordInSentence("I Know Spring Boot"));
        System.out.print("Reverse of each word of 'India is great' is ");
        System.out.println(Reverse.reverseEachWordInSentence("India is great"));


        System.out.println("\n\n************************************** Reverse Each Word In Sentence ********************************************");
        System.out.println("is 'JavaJ2eeStrutsHibernate' rotation of 'StrutsHrernateJavaJ2ee' : "+Rotation.isOneStringIsRotationOfAnotherString("JavaJ2eeStrutsHibernate", "StrutsHrernateJavaJ2ee"));
        System.out.println("is 'JavaJ2eeStrutsHibernate' rotation of 'StrutsHerrnateJavaJ2ee' : "+Rotation.isOneStringIsRotationOfAnotherString("JavaJ2eeStrutsHibernate", "StrutsHerrnateJavaJ2ee"));
        System.out.println("is 'JavaJ2eeStrutsHibernate' rotation of 'HibernateJavaJ2eeStruts' : "+Rotation.isOneStringIsRotationOfAnotherString("JavaJ2eeStrutsHibernate", "HibernateJavaJ2eeStruts"));
        System.out.println("is 'springboot' rotation of 'bootspring' : "+Rotation.isOneStringIsRotationOfAnotherString("springboot", "bootspring"));
        System.out.println("is 'springboot' rotation of 'bootspring' : "+Rotation.isOneStringIsRotationOfAnotherString("springboot", "bootspring"));


        System.out.println("\n\n************************************** Read Student Details from CSV file ********************************************");
        Student[] studentList=ReadCSVFile.sortOnStudentLastName();
        for (Student student:studentList){
            System.out.println("FistName : "+student.getFirstName()+", LastName : "+student.getLastName()+", GPA : "+ student.getGPA());
        }


    }
}
