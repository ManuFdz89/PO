package Operaciones;

import java.util.Scanner;

public class ArrMultidimensionales {

    Scanner teclado = new Scanner(System.in);

    public void ejercicio1(){
        int[][] matriz = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void ejercicio2() {

        int[][] matriz = new int[2][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el valor para la posicion [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.print("Matriz resultante: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void ejercicio3(){
        int[][] matriz = new int[][]{{1,2,3,13},{4,5,6,14},{7,8,9,15},{10,11,12,16}};

        int suma=0;
        System.out.println("Matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
                suma += matriz[i][j];
            }
            System.out.println();
        }
        System.out.print("\nSuma total de elementos: "+suma);


    }
    public void ejercicio4(){
        int[][] matriz = new int[][]{{1,2,3,13,20},{4,5,6,14,24},{7,8,9,15,21}};

        boolean bandera = false;
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("\nIntroduce el numero a buscar: ");
        int numero = teclado.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero==matriz[i][j]){
                    System.out.printf("el numero %d se encuentra en la posicion [%d][%d]%n",numero,i,j);
                    bandera = true;
                }
            }
        }
        if (!bandera) {
            System.out.println("el numero no se encuentra en la matriz");
        }
    }
    public void ejercicio5(){
        double[][] matriz = new double[4][3];
        double[] promedio = new double[matriz.length];
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (Math.random()*9)+1;
                System.out.printf("%.1f ",matriz[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                promedio[i] += matriz[i][j];
            }
            System.out.printf("Promedio de fila %d: %.2f%n",i,(promedio[i]/ matriz[i].length));


        }
    }
    public void ejercicio6(){
        int[][] matriz = new int[3][4];
        int[] mayor = new int[matriz[0].length];
        System.out.println("\nMatriz: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*50));
                System.out.printf("%d ",matriz[i][j]);
                mayor[j]=matriz[i][j];
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i]>mayor[i]){
                    mayor[i] = matriz[j][i];
                }
            }
            System.out.printf("%nMayor columna %d: %d",i,mayor[i]);
        }
        System.out.println();
    }
    public void ejercicio7(){
        int[][] matriz = new int[3][4];
        System.out.println("\nMatriz original: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*50));
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nMatriz traspuesta: \n");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ",matriz[j][i]);

            }
            System.out.println();
        }
    }
    public void ejercicio8(){
        int[][] matriz = new int[4][5];
        int par = 0;
        int imPar = 0;
        System.out.println("\nMatriz: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*50));
                System.out.printf("%d ",matriz[i][j]);
                if (matriz[i][j]%2==0){
                    par++;
                }else {
                    imPar++;
                }
            }
            System.out.println();
        }
        System.out.println("\nNumeros pares: "+par);
        System.out.println("Numeros impares: "+imPar);
    }
    public void ejercicio9(){
        int[][] matriz = new int[10][10];
        System.out.println("Tabla de mulriplicar (10x10): ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i+1)*(j+1);
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public void ejercicio10(){

        System.out.print("Cuantos estudiantes hay?: ");
        int estudiantes = teclado.nextInt();
        System.out.print("Cuantas asignaturas hay?: ");
        int asignaturas = teclado.nextInt();
        System.out.println();

        double[][] matriz = new double[estudiantes][asignaturas];
        double[] promedio = new double[matriz.length];
        double[] promedioA= new double[matriz[0].length];
        double notaAlta = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce la nota del estudiante %d, asignatura %d: ",(i+1),(j+1));
                matriz[i][j] = teclado.nextDouble();
            }
        }
        System.out.println("\n---  TABLA DE NOTAS  ---\n");
        System.out.print("\t\t");
        for (int i = 0; i < matriz[0].length; i++) {
                System.out.printf("   Asig%d",(i+1));
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Est %d: ",(i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("\t\t%.1f",matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n---  PROMEDIO POR ESTUDIANTE  ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                promedio[i] += matriz[i][j];
            }
            System.out.printf("Estudiante %d: %.2f%n",(i+1),(promedio[i]/ matriz[i].length));
        }
        System.out.println("\n---  PROMEDIO POR ASIGNATURA  ---\n");
        /*for (int i = 0; i < promedio.length; i++) {
            promedio[i]=0;
        }*/
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                promedioA[i] += matriz[j][i];
            }
            System.out.printf("Asignatura %d: %.2f ",(i+1),(promedioA[i]/matriz.length));
            System.out.println();
        }
        System.out.println("\n---  NOTA MAS ALTA  ---\n");
        int estudiante = 1;
        int asignatura = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]>notaAlta){
                    notaAlta = matriz[i][j];
                    estudiante = i+1;
                    asignatura = j+1;
                }
            }
        }
        System.out.printf("La nota mas alta es %.1f (Estudiante %d, Asignatura %d)",notaAlta,estudiante,asignatura);



    }

}
