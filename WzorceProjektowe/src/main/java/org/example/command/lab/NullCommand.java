package org.example.command.lab;

public class NullCommand implements Command{
    @Override
    public void wykonaj() {
        System.out.println("Nic się nie wykonało.");
    }

    @Override
    public void cofnij() {
        System.out.println("Nic się nie wycofało.");
    }
}
