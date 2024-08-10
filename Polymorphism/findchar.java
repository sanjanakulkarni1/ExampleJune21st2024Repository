package Polymorphism;

public class findchar {
    public static void main(String[] args) {
        String ch = "sanjana kulkarni";
        StringBuffer str = new StringBuffer(ch);
        int count = 0;
        for (char c : str.toString().toCharArray())
            count++;
        {
            System.out.println("number of char" + count);

        }
    }
}
