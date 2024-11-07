// Osmer David Cardona Mejia
// NC: 202410050140
// Este le pide los datos personales como el nombre , apellido ,carrera y por ultimo el lugar de trabajo
public class Ejercicio5
{
    public static void main(String[] args)
    {
        String[][] compañerosdeclase = {
            {"Ruth", "Bautista", "Ing.Industrial", "Corporation LEAR"},
            {"Luis", "Ayala", "Ing.Industrial", "Camaronera"},
            {"Bryan", "Vasquez", "Ing.Electronica", "ENNE"},
            {"Luis", "Juarez", "Ing.Electronica", "Tecnico Electricista"},
            {"Norma", "Gavarrete", "Ing.Industrial", "Maquila"}
        };

        for (int i = 0; i < compañerosdeclase.length; i++)
        {
            System.out.println("Companero " + (i + 1) + ": ");
            System.out.println("Nombre: " + compañerosdeclase[i][0]);
            System.out.println("Apellido: " + compañerosdeclase[i][1]);
            System.out.println("Carrera: " + compañerosdeclase[i][2]);
            System.out.println("Lugar de Trabajo: " + compañerosdeclase[i][3]);
            System.out.println();
        }
    }
}