public class Main {
    public static void main(String[] args) {
//        NIE MODYFIKUJ TEJ KLASY

//        Na konsoli ma się pojawić:
//          Zarezerwowano miejsce numer 0 na sali 1
//          Zarezerwowano miejsce numer 1 na sali 1
//          Zarezerwowano miejsce numer 2 na sali 1
//          Zarezerwowano miejsce numer 0 na sali 2
//          Zarezerwowano miejsce numer 1 na sali 2
//          Zwalniam miejsce 1
//          Miejsce nie bylo zajete
//          Nie ma takiego miejsca

        Sala sala1 = new Sala(1);
        Sala sala2 = new Sala(2);

//        Rezerwuje pierwsze wolne miejsce
        sala1.rezerwujMiejsce();
        sala1.rezerwujMiejsce();
        sala1.rezerwujMiejsce();
        sala2.rezerwujMiejsce();
        sala2.rezerwujMiejsce();

//        Zwalnia konkretne miejsce
        sala2.zwolnijMiejsce(1);
        sala2.zwolnijMiejsce(3);
        sala2.zwolnijMiejsce(100);
    }
}
