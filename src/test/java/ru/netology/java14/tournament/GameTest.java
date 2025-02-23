package ru.netology.java14.tournament;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

;

class GameTest {
    Game game = new Game();

    @Test
    public void register() {
        Player player1 = new Player(1, "Крутой228", 10);
        game.register(player1);

        Player expected = player1;
        Player actual = game.register(player1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findByName() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 7);
        Player player3 = new Player(3, "Вовка50", 30);
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.findByName("Крутой228");

        Player expected = player1;
        Player actual = game.register(player1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findByName2() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 7);
        Player player3 = new Player(3, "Вовка50", 30);

        game.register(player2);
        game.register(player3);
        game.findByName("Крутой228");

        String expected = null;
        Player actual = game.findByName("Крутой228");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void round() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 7);
        Player player3 = new Player(3, "Вовка50", 30);
        game.register(player1);
        game.register(player2);


        int expected = 1;
        int actual = game.round("Крутой228", "Жесткий");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void round2() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 12);
        Player player3 = new Player(3, "Вовка50", 30);
        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Крутой228", "Жесткий");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void round3() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 10);
        Player player3 = new Player(3, "Вовка50", 30);
        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Крутой228", "Жесткий");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void round4() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 10);
        Player player3 = new Player(3, "Вовка50", 30);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Крутой228", "Жесткий")
        );

    }

    @Test
    public void round5() {
        Player player1 = new Player(1, "Крутой228", 10);
        Player player2 = new Player(2, "Жесткий", 10);
        Player player3 = new Player(3, "Вовка50", 30);
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Крутой228", "Жесткий")
        );
    }
}