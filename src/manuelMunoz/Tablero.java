public class Tablero {

    private final char ESPACIO_VACIO = 'a';
    private static char[][] tablero;

    public Tablero(int filas, int columnas) {
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                tablero[i][j] = ESPACIO_VACIO;
            }
        }

        tablero[1][2] = 'a';
    }
    
    public void mostrarTablero(){
        for (char[] fila : tablero) {
            for (char espacio : fila) {
                System.out.print(espacio);
            }
            System.out.println();
        }
    }
}