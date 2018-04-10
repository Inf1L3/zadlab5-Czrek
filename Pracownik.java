
public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String pozycja;

    public Pracownik(String imie, String nazwisko, int wiek, String pozycja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pozycja = pozycja;
    }

    public String toString() {
        return "Imie=" + imie + "\nNazwisko=" + nazwisko + "\nWiek=" + wiek + "\nPozycja=" + pozycja;
    }

} 