public class RandomNumbers {
    public static void main(String[] args) {
        
        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)
        int[][] integers = new int[100][10];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                integers[i][j] = randomNumber(99);
            }
        }
        print2DArray(integers);
    }

    /**
     * Function name: randomNumber
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */
    public static int randomNumber(int number){
        return (int)(Math.random() * number) ;

    }

    /**
     * Function name: print2DArray
     * 
     * @param integers (2D array int)
     * 
     * Inside the function:
     * 1. nested loop that prints a 2D array using the randomNumber function
     */
    public static void print2DArray(int[][] integers){
        System.out.println("integer = [");
        for (int i = 0; i < 100; i++) {
            System.out.println();
            System.out.print("[");
            for (int j = 0; j < 10; j++) {

                System.out.print( integers[i][j] + ", ");

            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("]");
    }
}