package org.example.state;

public abstract class StanMaszyny {
    public int liczbaGum = 0;
    public StanMaszyny(int count) {
        this.liczbaGum = count;
    }
    public StanMaszyny wkładanieMonety() {
        return this;
    }
    public StanMaszyny przekrecanieGalki() {
        return this;
    }
    public StanMaszyny wydawanieGumy() {
        return this;
    }
    public StanMaszyny zwracanieMonety() {
        return this;
    }
    public StanMaszyny uzupelnijGumy(int i) {
        System.out.println("Napełniam maszynę.");
        return new StanNieMaMonety(i);
    }
    public abstract String ToString();
}
