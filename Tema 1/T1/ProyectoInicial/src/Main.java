public class Main {
    // esto es un comentario
    /*
    este comentario
    se puede dividir en
    varias lineas de codigo
     */
    // TODO me falta esto
    int edadGlobal = 12;


    public static void main(String[] args) {
        System.out.println("Primer programa en JAVA");

        String miNombre = "Borja"; // null
        Character letraCompleja = 'a';
        char letraDNI = 'A';
        Integer edadCompleja = 12;
        int edad = 41;


        final String DNI = "123123A";
        Double alturaCompleja = 21.76;
        double altura = 1.71;
        Float pesoCompleja = 21.12f;
        float peso = 70.7f;
        Boolean experienciaCompleja = false;
        boolean experiencia = true;

        edad = 23;
        letraDNI = 109;
        miNombre = "Borja M. H.";
        altura = 1.75;
        peso = 67.5f;
        experiencia = false;

        System.out.println("Mi nombre es: " + miNombre);
        System.out.println("La letra de mi dni es " + letraDNI);
        System.out.println("Mi edad es " + edad + " años");
        System.out.println("Mi altura es de " + altura + " cm");
        System.out.println("Mi peso es de " + peso + " kg");
        System.out.println("Mi experiencia es: " + experiencia);
        System.out.println("Mi DNI es: " + DNI);
        System.out.println("El valor del numero PI es " + Math.PI);
        System.out.println("El valor del numero E es " + Math.E);
        System.out.println("El valor maximo de un int es " + Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es " + Integer.MIN_VALUE);


    }

    public void nombreMetodo() {
        int edadMetodo = 12;
        System.out.println(edadMetodo);
        System.out.println(edadGlobal);
    }

    public void nombreMetodo1(int edadGlobal) {
        int edadMetodo = 123;
        System.out.println(edadMetodo);
        System.out.println(this.edadGlobal);
    }
    // TODO esto tambien esta pendiente
}