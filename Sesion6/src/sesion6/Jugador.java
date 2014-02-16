
package sesion6;

public class Jugador {
    private int id;
    private String jugador;
    private String consola;

    public Jugador(int id, String jugador, String consola) {
        this.id = id;
        this.jugador = jugador;
        this.consola = consola;
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
    
}
