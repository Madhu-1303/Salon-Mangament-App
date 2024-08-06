class equalsDemo
{
    public static void main(String[] args)
    {
        String s1 = "Heloo";
        String s2= "Hello byee"
        String s3="Good-Bye";
        String s4="HELLO";
        System.out.println(+" equals " + s2 + "->");
        System.out.println(s1.equals(s2));

        System.out.println(+" equals " + s3 + "->");
        System.out.println(s1.equals(s3));

        System.out.println(+" equals " + s4 + "->");
        System.out.println(s1.equals(s4));

        System.out.println(+" equals " + s4 + "->");
        System.out.println(s1.equalsIngoreCase(s4));
    }
}