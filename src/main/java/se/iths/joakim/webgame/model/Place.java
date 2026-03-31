package se.iths.joakim.webgame.model;

public enum Place {

    CENTRAL(
            "Centralen",
            "Du står på den centrala platsen"
    ),
    NORTH(
            "Norr",
            "Du är på den norra plasen"
    ),
    SOUTH(
            "Söder",
            "Du är på den södra platsen"
    );


    private final String name;
    private final String description;

    Place(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
