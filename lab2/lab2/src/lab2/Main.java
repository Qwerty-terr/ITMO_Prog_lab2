package lab2;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Klefki("Клефки", 43));
        b.addAlly(new Riolu("Риолу", 1));
        b.addAlly(new Lucario("Лукарио", 65));
        b.addFoe(new Pichu("Пичу", 1));
        b.addFoe(new Pikachu("Пикачу", 58));
        b.addFoe(new Raichu("Райчу", 58));
        b.go();
    }
}