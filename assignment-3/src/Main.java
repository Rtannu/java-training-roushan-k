public class Main {
    public static void main(String[] args) {
        // Department | abstract
        Department department=new ComputerScienceDepartment();
        int departmentSize=department.getDepartmentSize();
        System.out.println("Department Size="+departmentSize);

        // Product | Overloading
        Product product=new Product();
        double productPrice=product.getPrice(5);
        System.out.println("Product Price ="+productPrice);

        // Run Time Runtime Polymorphism
        Bird bird=new EagleBird();
        bird.display();


    }
}