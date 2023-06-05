public class Phone implements IApplePhone,IAndroidPhone {
    @Override
    public void displayAndroid() {
        System.out.println("I am Android");

    }

    @Override
    public void displayApple() {
        System.out.println("I am Apple");
    }
}