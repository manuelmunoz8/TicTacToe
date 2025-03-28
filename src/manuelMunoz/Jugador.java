class Jugador{

    private final char signo;

    public Jugador(char signo){
        this.signo = signo;
    }

    public char signo(){
        return signo;
    }

    public void Reaccionar(){
        int rand = (int)Math.floor(Math.random() * 7);
        switch (rand) {
            case 0 -> System.out.println("*FLIPS TABLE*");
            case 1 -> System.out.println("Vale...");
            case 2 -> System.out.println("Porque?");
            case 3 -> System.out.println("QUE!??!");
            case 4 -> System.out.println("WHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            case 5 -> System.out.println("No me gusta donde va esto");
            case 6 -> System.out.println("Estoy a punto de retirarme");
        }
    }



}