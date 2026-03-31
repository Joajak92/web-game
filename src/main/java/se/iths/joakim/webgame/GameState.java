package se.iths.joakim.webgame;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import se.iths.joakim.webgame.model.Place;

@Component
@SessionScope
public class GameState {
    private Place currentPlace = Place.CENTRAL;

    public Place getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }
}
