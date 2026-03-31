package se.iths.joakim.webgame.service;

import org.springframework.stereotype.Service;
import se.iths.joakim.mytextformatter.TextFormatter;
import se.iths.joakim.webgame.GameState;
import se.iths.joakim.webgame.model.Place;

@Service
public class GameService {
    private final GameState gameState;
    private final TextFormatter textFormatter;

    public GameService(GameState gameState, TextFormatter textFormatter) {
        this.gameState = gameState;
        this.textFormatter = textFormatter;
    }

    public void handleCommand(String command) {
        String formattedCommand = textFormatter.removeSpaces(command);
        String cmd = textFormatter.toLowerCase(formattedCommand).trim();

        switch (cmd) {
            case "gå norrut" -> gameState.setCurrentPlace(Place.NORTH);
            case "gå söderut" -> gameState.setCurrentPlace(Place.SOUTH);
            case "gå till centrum" -> gameState.setCurrentPlace(Place.CENTRAL);
        }
    }

    public GameState getGameState() {
        return gameState;
    }
}
