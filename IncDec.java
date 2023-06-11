class IncDec
{
    public static void main(String s[])
    {
        
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;

        c++;

        System.out.println("a = " + a);
        System.out.print("b = " + b);
        System.out.println("c = " + c);
        System.out.print("d = " + d);
    }
}

output: a = 2
b = 3c = 4
d = 1