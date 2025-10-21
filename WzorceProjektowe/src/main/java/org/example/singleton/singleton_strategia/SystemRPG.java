package org.example.singleton.singleton_strategia;

public class SystemRPG {
    private static SystemRPG systemRPG;
    private SystemRPG() {}
    public static SystemRPG zainicjujSystem() {
        if (systemRPG == null) {
            systemRPG = new SystemRPG();
        }
        return systemRPG;
    }
    public void rzutNaInicjatywe() {
        System.out.println("Nie udało się, przeciwnik zaczyna pierwszy swoją turę.");
    }
}
