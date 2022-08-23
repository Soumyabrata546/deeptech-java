package firstPackage;

class Loop1
{
    public static void main(String s[])
    {
        int sum = 23;        

        for(int i = 2; i <= 5; i++ )
        {
            for(int j = 7; j <= 9; j++ )
            {
                sum += ( i * j);
            }
        }

        System.out.println("sum = " + sum);
    }
}