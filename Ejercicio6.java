// Osmer David Cardona Mejia
// 202410050140
//Este programa verifica quien aprovo y quien reprobro por medio de la nota que tengan
public class Ejercicio6 
{
    public static void main(String[] args) 
    {
        String[] compañeros = {"Mirian", "Danlis"};
        int[] notas = {60, 70};

        for (int i = 0; i < compañeros.length; i++)
        {
            System.out.println("Nombre: " + compañeros[i]);
            System.out.println("Nota: " + notas[i]);
            if (notas[i] >= 70) {
                System.out.println("Resultado: Aprobado");
            } else {
                System.out.println("Resultado: Reprobado");
            }
            System.out.println();
        }
    }
}
