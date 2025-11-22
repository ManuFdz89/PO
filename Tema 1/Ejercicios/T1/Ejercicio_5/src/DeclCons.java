public class DeclCons {

    public static void main(String[] args) {

        final String APLICACION = "MiApp"; // usamos final delante de la variable para que sea constante (no mutable)
        final String VERSION = "1.0.0"; // nombre de las variables no mutable en mayuscula
        String usuario = "Manu";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: "+APLICACION);
        System.out.println("Versión: "+VERSION);
        System.out.println("Valor de PI: "+Math.PI);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuación: "+puntuacion);

        usuario = "Juan";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada: "+puntuacion);

    }
}
