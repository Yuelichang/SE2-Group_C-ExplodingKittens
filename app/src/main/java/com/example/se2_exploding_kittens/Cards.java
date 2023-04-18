package com.example.se2_exploding_kittens;

public abstract class Cards {
    int id;
    boolean bomb;
    String cardPath;

    public int getId() {
        return id;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }

    public abstract void cardAction(Player p1, Player p2);
}


