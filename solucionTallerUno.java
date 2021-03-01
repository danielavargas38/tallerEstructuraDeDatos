/*
Daniela Vargas Zuleta 
CC 1036686455 
grupo: lunes y miercoles 2-4
*/
package tallerUno;


import java.util.*;


public class solucionTallerUno {

    public static void main(String[] args) {
        //Punto Número 1
        Scanner input = new Scanner (System.in);
        System.out.println("Digite números enteros separados por comas:");
        String numeros= input.next();
        String parts[] = numeros.split(",");
        int arrayParse[] = new int[parts.length];
        int mayor = Integer.parseInt(parts[0]);
        int menor = mayor;
        int suma = 0;
        double sumaDouble = 0;
        for(int j = 0;j < parts.length;j++){
            arrayParse[j] = Integer.parseInt(parts[j]);
            suma += arrayParse[j];
            sumaDouble += arrayParse[j];
            if(j > 0){
                if(arrayParse[j] > mayor){
                    mayor = arrayParse[j];
                }
                if(arrayParse[j] < menor){
                    menor = arrayParse[j];
                }
            }
        }
        double tamano= parts.length;
        double promedio = sumaDouble/tamano;
        System.out.println("La suma de los números es:");
        System.out.println(suma);
        System.out.println("El promedio es:");
        System.out.println(promedio);
        System.out.println("El número menor es:");
        System.out.println(menor);
        System.out.println("El número mayor es:");
        System.out.println(mayor);
        //Punto Número 2
        int a1[] = {1,2};
        int b1[] = {5,6};
        System.out.println("_____________________");
        System.out.println("Punto número dos:");
        System.out.println("Número escalar A:");
        int totalPuntoA1 = escalar(a1,b1);
        System.out.println(totalPuntoA1);
        int a2[] = {1,2,3};
        int b2[] = {5,6,7};
        System.out.println("Número escalar B:");
        int totalPuntoA2 = escalar(a2,b2);
        System.out.println(totalPuntoA2);
        int a3[] = {1,2,3,4};
        int b3[] = {5,6,7,8};
        int totalPuntoA3 = escalar(a3,b3);
        System.out.println("Número escalar C:");
        System.out.println(totalPuntoA3);
        
        
        
        //Punto Número 3
        int u[] = {1,2,3};
        int v[] = {1,2,3};
        int totalPunto3[] = vectores(u,v);
        System.out.println("_____________________");
        System.out.println("Punto número tres:");
        for(int i = 0;i < 3; i++){
            if(i == 0){
                System.out.println("I:");
                System.out.println(totalPunto3[i]);
            }
            if(i == 1){
                System.out.println("J:");
                System.out.println(totalPunto3[i]);
            }
            if(i == 2){
                System.out.println("K:");
                System.out.println(totalPunto3[i]);
            }
        }
        //Punto Número 4
        System.out.println("_____________________");
        System.out.println("Punto número cuatro:");
        System.out.println("digite la longitud x de la matriz");
        System.out.println("digite la longitud y de la matriz");
        
        
    }
    
    public static int escalar(int a[],int b[]){
        int sumatoria = 0;
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(i == j){
                    total = a[i] * b[j]; 
                    sumatoria += total;
                    total = 0;
                }
            }
        }
        return sumatoria;
    }

    public static int[] vectores(int u[],int v[]){
        int k1 = 0;
        int j1 = 0;
        int k2 = 0;
        int i1 = 0;
        int i2 = 0;
        int j2 = 0;
        for(int i = 0; i < u.length; i++){
            for(int j = 0; j < v.length; j++){
                if(i == 0){
                    //k1(u1 * v2)
                    if(j == 1){
                        k1 = u[i] * v[j];
                    }
                    //j1(u1 * v3)
                    if(j == 2){
                        j1 = u[i] * v[j];
                    }
                }
                if(i == 1){
                    //k2(u2 * v1)
                    if(j == 0){
                        k2 = v[j] * u[i];
                    }
                    //i1(u2 * v3)
                    if(j == 2){
                        i1 = u[i] * v[j];
                    }
                    
                }
                if(i == 2){
                    //i2(u3 * v2)
                    if(j == 1){
                        i2 = v[j] * u[i];
                    }
                    //j2(u2 * v3)
                    if(j == 0){
                        j2 = v[j] * u[i];
                    } 
                }
            }
        }
        int total1 = 1 * (i1 - i2);
        int total2 = - 1 * (j1 - j2);
        int total3 = 1 * (k1 - k2);
        int total[] = {total1,total2,total3};
        return total;
        
    }
    
    
}
