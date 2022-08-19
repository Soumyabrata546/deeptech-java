public class sec {
    public static void main(String args[]){
    int a=10,b=20,c;
    System.out.println("Before a="+a+'\t'+"b="+b);

        c=a;
        a=b;
        b=a;
        System.out.println("After Swaping a="+a+" "+"b="+b);
    }
}
