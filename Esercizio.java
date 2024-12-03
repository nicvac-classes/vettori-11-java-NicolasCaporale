//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
              Scanner in = new Scanner(System.in);
      Random rand = new Random();
      
      int n;

      System.out.print("Inserire il numero di cifre da inserire in input: ");
      n = Integer.parseInt(in.next());
      
      int[] u = new int[n];
      
      for(int i = 0; i < n; i++){
        System.out.print("Inserire il " + (i+1) + " valore del vettore U: ");
        u[i] = Integer.parseInt(in.next());
        if(u[i] < 0){
            do{
                System.out.print("INserire un valore positivo: ");
                u[i] = Integer.parseInt(in.next());
            }while(u[i] < 0);
        }
      }

      int[] r = new int[n];
      for(int i = 0; i < n; i++){
        r[i] = rand.nextInt(11);
      }

      int[] s = new int[n];
      for(int i = 0; i < n; i++){
        s[i] = rand.nextInt(6) + 3;
      } 

      float[] m = new float[n];
      for(int i = 0; i < n; i++){
        m[i] = (u[i] + r[i] + s[i]) / 3;
      }

      for(int i = 0; i < n; i++){
        System.out.println((i+1) + "° elemento di M: " + m[i]);
      }

      int t;
      System.out.print("Inserire un numero: ");
      t = Integer.parseInt(in.next());
      for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
          if(t == (u[i] + u[j])){
            System.out.println(u[i] + " + " + u[j] + " = " + t);
          }
        }
      }

    
  }
}