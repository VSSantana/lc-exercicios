package m3;

public class Cat {

    private String race;

    public Cat(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cats [race=" + race + "]";
    }

}
