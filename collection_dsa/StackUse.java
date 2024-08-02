package collection_dsa;

import java.util.Stack;

public class StackUse
{
    //  method to reverse an array using a Stack
    public static int[] reverseArray(int []ar)
    {
        Stack<Integer> reverse = new Stack<>();
        // pushing all array elements to Stack
        for(int el : ar)
        {
            reverse.push(el);
        }
        // Now popping all Stack elements to the same array back
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=reverse.pop();
        }
        printElements(ar);
        return ar;
    }

    // method to print the array elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }



    //  Method to separate alphabets and numbers of a String using Stack
    public static void separateAlphabetAndNumber(String str)
    {
        Stack<Character> alphabet = new Stack<>();
        Stack<Character> number = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(Character.isLetter(ch))
                alphabet.push(ch);
            else
                number.push(ch);
        }
        System.out.println("All alphabets are : "+alphabet);
        System.out.println("All Numbers are : "+number);
    }



    // Function to check if the parentheses in a string are balanced
    public static boolean isParenthesisBalanced(String expression)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : expression.toCharArray())
        {
            if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                // If stack is empty or top element is not the matching opening, return false
                if(stack.isEmpty() || stack.pop() != '(')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


        // method to reverse a String using Stack
    public static void reverseString(String str)
    {
        int n=str.length();
        Stack<Character> reverse = new Stack<>();

        for(char c : str.toCharArray())
        {
            reverse.push(c);
        }
        String newString = "";
        for(int i=0;i<n;i++)
        {
            newString+=reverse.pop();
        }
        System.out.println(reverse.toString());
        System.out.println("Reversed String is : "+newString);
    }



    // Method to sortStack
    public static Stack<Integer> sortStack(Stack<Integer> stack)
    {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty())
        {
            // Stored first value in variable to check present element in temp Stack and this that which one is greater
            int value = stack.pop();
            // Jab new Stack khali na ho to hi check karo ki iska peek element incoming element se bada h ki
            while(!temp.isEmpty()  && temp.peek() > value)
            {
                stack.push(temp.pop());
            }
            temp.push(value);
        }
        return temp;  // this is the sorted Stack
    }

   // method to sort the double values Stack
    public static Stack<Double> sortDoubleStack(Stack<Double> stack)
    {
        Stack<Double> sort = new Stack<>();
        while (!stack.isEmpty())
        {
            double x = stack.pop();
            while(!sort.isEmpty() && sort.peek() > x)
            {
                stack.push(sort.pop());
            }
            sort.push(x);
        }
        return sort;
    }


    public static void main(String[] args) {
    /*   int []ar={5,2,1,7,4,9,3};
        reverseArray(ar);

     */
     //   separateAlphabetAndNumber("Vi2k3a4sh6");
     //   System.out.println("IsParenthesisBalanced : "+isParenthesisBalanced("(a + b) * (c + d)"));

     //   reverseString("Hello");

      /*  Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(2);
        stack.add(7);
        stack.add(4);
        stack.add(8);

        Stack<Integer> st =sortStack(stack);
        System.out.println("Sorted Integer Stack is : "+st);

       */
        Stack<Double> sorted = new Stack<>();
        sorted.push(5.2);
        sorted.push(3.2);
        sorted.push(1.1);
        sorted.push(8.4);
        sorted.push(6.1);

        Stack<Double> st = sortDoubleStack(sorted);
        System.out.println(st);

    }
}
