class Turno{

    private final int cantidadJugadores;
    private int turnoDeJugador;

    public Turno(Jugador jugadores[]) {
        cantidadJugadores = jugadores.length;
    }

    public int cambiarTurno(){
        turnoDeJugador++;
        System.out.println("cambio de turno");
        return turnoDeJugador % cantidadJugadores;
    }

    public int turnoDeJugador(){
        return turnoDeJugador;
    }

}