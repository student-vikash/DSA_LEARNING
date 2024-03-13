package oops_round_2;

public class Teacher
{
    public void teaching()
    {
        System.out.println("Teacher always used to teach in the morning and evening.");
    }
    public void exercise()
    {
        System.out.println("Teacher is habitual of taking exercise in the morning.");
    }
     static class Student extends Teacher
    {
        public void read()
        {
            System.out.println("Students are habitual of taking exercises daily.");
        }
    }

    public static void main(String[] args) {
        Student st=new Student();

        st.exercise();
        st.read();

    }
}
