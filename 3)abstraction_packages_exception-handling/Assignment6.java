interface Playable {
    void play();
}

class Veena implements Playable {

    @Override
    public void play() {
        System.out.println("Veena is playing");
    }
}


class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}

public class Assignment6 {

    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        veena.play();
        saxophone.play();

        Playable playable = veena;
        playable.play();
        playable = saxophone;
        playable.play();
    }
}