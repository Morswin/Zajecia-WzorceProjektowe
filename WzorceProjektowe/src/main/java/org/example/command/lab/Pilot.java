package org.example.command.lab;

import java.util.ArrayList;
import java.util.Stack;

public class Pilot {
    Stack<Command> history = new Stack<>();
    ArrayList<Command> komendy = new ArrayList<>();
    void wykonaj(int id_komendy) {
        Command command = komendy.get(id_komendy);
        command.wykonaj();
        history.push(command);
    }
    void cofnij() {
        if (!history.empty()) {
            Command command = history.pop();
            if (command != null) {
                command.cofnij();
            }
        }
    }
    void przypisz(Command command) {
        komendy.add(command);
    }
}
