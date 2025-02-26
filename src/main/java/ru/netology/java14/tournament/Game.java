package ru.netology.java14.tournament;

import java.util.HashMap;
import java.util.Map;

public class Game {

    protected Map<String, Player> players = new HashMap<>();


    // Метод регистрации игрока ,если игрок не зарегистрирован, то он не сможет играть в турнире.
    public Player register(Player player) {
        players.put(player.getName(), player);

        return player;
    }


    // Метод поиска по имени
    public Player findByName(String name) {
        return players.get(name); //Возвращаем игрока по имени
    }

    // Mетод соревнования между двумя игроками , Если хотя бы один игрок не зарегистрирован то выкидывается исключение.
    public int round(String playerName1, String playerName2) {
        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }
        return 0;
    }
}


