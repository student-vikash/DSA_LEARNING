package oops_revision2;

public class UseStudent2 {
    public static void main(String[] args) {
        Student2 st=new Student2();
        st.setStudent(-12,"Vikash",90.40);
        st.showStudent();

        System.out.println();

        st.setStudent(13,"Sachin",88.34);
        st.showStudent();
    }
}
