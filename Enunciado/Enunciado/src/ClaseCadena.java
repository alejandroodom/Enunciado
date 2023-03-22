public class ClaseCadena {

    public static String devuelveIniciales(String nombreCompleto) {
        String iniciales = "";

        if (nombreCompleto == null || nombreCompleto.isEmpty()) {
            return iniciales;
        }

        String[] nombresApellidos = nombreCompleto.split(" ");

        for (String nombreApellido : nombresApellidos) {
            if (!nombreApellido.isEmpty()) {
                iniciales += Character.toUpperCase(nombreApellido.charAt(0)) + ".";
            }
        }

        return iniciales;
    }

}
