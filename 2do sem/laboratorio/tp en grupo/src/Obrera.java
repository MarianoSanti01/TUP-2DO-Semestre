public class Obrera extends Thread {
    private String resultado = "No calculado";

    public void run() {
        resultado = calcula();
    }

    String calcula() {
        // Realiza un cálculo largo.
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // Manejo de la excepción
            e.printStackTrace();
        }
        return "Ya calculado";
    }

    public String getResultado() {
        return resultado;
    }
}
