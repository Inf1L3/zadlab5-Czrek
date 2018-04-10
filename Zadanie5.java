
import java.util.Scanner;


public class Zadanie5 {
 
     public static void main(String[] args) {
        Scanner in= new Scanner(System.in)
     int a = in.nextInt();
     
     switch (a)
         case 1:
     
     {
        Stos newStack = new Stos();
       for (int i = 0; i < 100; i++) {
           newStack.Push((int)Math.random());
       }            
    
    for (int i = 0; i < 100; i++) {
            System.out.println(i+1+"."+newStack.Pop());
        }

    public Zadanie5() {
        this.i = 0;
    }
     

     case 2
     {
      Firma newFirma = new Firma();
      newFirma.wpiszPracownika(0);
      newFirma.wPracownika();
     }
     case 3
     {    
       Liczba b = new Liczba("3");
       b.konw();
       b.wypisz();
        System.out.println(a.mnóż(5));
        System.out.println(a.silnia());
    }
}}     } 
