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

        this.numerSali = numerSali;
    }


    public void rezerwujMiejsce() {
        for (int i = 0; i < miejsca.length; i++) {
            if (!miejsca[i].zajete) {
                miejsca[i].zajete = true;
                System.out.println("Zarezerwowano miejsce numer " + i + " na sali " + numerSali);
                break;
            }
        }
    }

    public void zwolnijMiejsce(int numerMiejsca) {
        if(numerMiejsca >= miejsca.length) {
            System.out.println("Nie ma takiego miejsca");
        } else {
            if (miejsca[numerMiejsca].zajete) {
                miejsca[numerMiejsca].zajete = false;
                System.out.println("Zwalniam miejsce " + numerMiejsca);
            } else {
                System.out.println("Miejsce nie bylo zajete");
            }
        }
    }
}
