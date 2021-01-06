class uday
{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("ajay kumar");
        System.out.print("additon of a nad b is:");
        System.out.println(a+b);
        int num = 167;
        int rev=0;
        int rem = 0;
        while(num>0)
        {
            rem  = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        System.out.println("reversed number is: "+rev);
    }
}