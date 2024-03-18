import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n1;
        int n2;
        double numDouble;
        double num2Double;
        double num3Double;
        double num4Double;
        double num5Double;
        int n3;
        int n4;
        double num6Double;
        double num7Double;
        int n8;
        int n9;
        System.out.println("Inserisci due numeri interi");
        n1= input.nextInt();
        n2=input.nextInt();
        minimo(n1,n2);
        System.out.println("Il numero minimo è: ");
        System.out.println(minimo(n1,n2));
        System.out.println("Inserisci due double");
        numDouble=input.nextDouble();
        num2Double= input.nextDouble();
        minimoDouble(numDouble,num2Double);
        System.out.println("Il numero minimo è: ");
        System.out.println(minimoDouble(numDouble,num2Double));
        System.out.println("Inserisci tre numeri double");
        num3Double= input.nextDouble();
        num4Double=input.nextDouble();
        num5Double=input.nextDouble();
        minimo3Double(num3Double,num4Double,num5Double);
        System.out.println("Il numero minimo è: ");
        System.out.println(minimo3Double(num3Double,num4Double,num5Double));
        System.out.println("Inserisci due numeri interi");
        n3=input.nextInt();
        n4=input.nextInt();
        massimo(n3,n4);
        System.out.println("Il numero massimo è: ");
        System.out.println(massimo(n3,n4));
        System.out.println("Inserisci due numeri interi");
        num6Double=input.nextDouble();
        num7Double= input.nextDouble();
        massimoDouble(num6Double,num7Double);
        System.out.println("Il numero massimo è:");
        System.out.println(massimoDouble(num6Double,num7Double));
        System.out.println("Inserisci un intero");
        n8=input.nextInt();
        assoluto(n1);
        System.out.println("Il valore assoluto è: ");
        System.out.println(assoluto(n8));
        System.out.println("Inserisci un numero intero");
        n9=input.nextInt();
        isPari(n9);
        System.out.println("è pari?");
        System.out.println(isPari(n1));
    }
    public static int minimo (int n1, int n2){
        int minimo;
        if (n1>n2){
            minimo=n2;
        }
        else{
            minimo=n1;
        }
        return minimo;
    }
    public static double minimoDouble (double n1, double n2){
        double minimo;
        if (n1>n2){
            minimo=n2;
        }
        else{
            minimo=n1;
        }
        return minimo;
    }
    public static double minimo3Double (double n1, double n2, double n3){
        double minimo=0;
        if (n1<n2&&n1<n3){
            minimo=n1;
        }
        else if (n2<n1&&n2<n3){
            minimo=n2;
        }
        else if (n3<n1&&n3<n2){
            minimo=n3;
        }
        return minimo;
    }
    public static int massimo (int n1, int n2){
        int massimo;
        if (n1>n2){
            massimo=n1;
        }
        else{
            massimo=n2;
        }
        return massimo;
    }
    public static double massimoDouble (double n1,double n2){
        double massimo;
        if (n1>n2){
            massimo=n1;
        }
        else{
            massimo=n2;
        }
        return massimo;
    }
    public static int assoluto (int n1){
        int assoluto=0;
        if (n1<0){
            n1=n1*-1;
            assoluto=n1;
        }
        else{
            assoluto=n1;
        }
        return assoluto;
    }
    public static boolean isPari (int n1){
        boolean isPari=false;
        if (n1%2==0){
            isPari=true;
        }
        return isPari;
    }
}