public class Sala {
    Miejsce[] miejsca;
    int numerSali;

    public Sala(int numerSali) {
        miejsca = new Miejsce[5];
        miejsca[0] = new Miejsce();
        miejsca[1] = new Miejsce();
        miejsca[2] = new Miejsce();
        miejsca[3] = new Miejsce();
        miejsca[4] = new Miejsce();
    }
}
