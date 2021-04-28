public class Main {
    public static void main(String[] args) {
        Marin m = new Marin();

        m.move();

        m.attack();

        System.out.println("마린체력 : "+m.hp);

        Mixer x = new Mixer();

        x.setPower(true);

        x.power();

        x.blade();

    }
}
