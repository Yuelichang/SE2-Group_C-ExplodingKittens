package com.example.se2_exploding_kittens.game_logic.cards;

import com.example.se2_exploding_kittens.R;

public class FavorCard implements Card {
    public FavorCard() {
        //This class in itself is a datatype, so we don't need to initialize anything else here.
    }

    @Override
    public int getImageResource() {
        return R.drawable.favorcard;
    }
}
