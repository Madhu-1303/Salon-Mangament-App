class HelloWorld
{
    public static void main(String[] args )
    {
        String str1=new String("welcome to ballari");
        String str2=new String("KARNATAKA");
        String str3=new String("karnataka");
        System.out.println("Result of Comparing of String 1 and String 2:");
        System.out.println(str1.regionMathces(11,str2,0,13));
        System.out.println("Result of Comparing of String 1 and String 3:");
        System.out.println(str1.regionMathces(11,str3,0,13));
        System.out.println("Result of Comparing of String 1 and String 3:");
        System.out.println(str1.regionMathces(0,str3,0,13));
        

    }
}