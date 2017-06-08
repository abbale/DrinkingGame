package game.drinking.id.drinkinggame;

/**
 * Created by mr_sid on 08-Jun-17.
 */

public class Card {
    String NameOfCard;
    String NameOfGame;
    String GameDescription;

    public Card(String nameOfCard, String nameOfGame, String gameDescription) {
        NameOfCard = nameOfCard;
        NameOfGame = nameOfGame;
        GameDescription = gameDescription;
    }

    public String getNameOfCard() {
        return NameOfCard;
    }

    public String getNameOfGame() {
        return NameOfGame;
    }

    public String getGameDescription() {
        return GameDescription;
    }

}