package oops_revision2;

public class UseProduct {
    public static void main(String[] args) {
        Product pt=new Product();
        pt.setId(-1);
        pt.setName("Soap");
        pt.setPrice(-15);

        System.out.println("Product Id : "+pt.getId());
        System.out.println("Product Name : "+pt.getName());
        System.out.println("Product Price : "+pt.getPrice());
    }
}
