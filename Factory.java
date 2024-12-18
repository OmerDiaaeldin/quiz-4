abstract class Mission {
    String name;
    String launchDate;

    Mission(String name, String launchDate) {
        this.name = name;
        this.launchDate = launchDate;
    }

    abstract void displayMissionDetails();
}

class CargoMission extends Mission {
    CargoMission(String name, String launchDate) {
        super(name, launchDate);
    }

    @Override
    void displayMissionDetails() {
        System.out.println("Cargo Mission: " + name + " (Launch Date: " + launchDate + ")");
    }
}

class ExplorationMission extends Mission {
    ExplorationMission(String name, String launchDate) {
        super(name, launchDate);
    }

    @Override
    void displayMissionDetails() {
        System.out.println("Exploration Mission: " + name + " (Launch Date: " + launchDate + ")");
    }
}

class MissionFactory {
    static Mission createMission(String type, String name, String launchDate) {
        if (type.equalsIgnoreCase("Cargo")) {
            return new CargoMission(name, launchDate);
        } else if (type.equalsIgnoreCase("Exploration")) {
            return new ExplorationMission(name, launchDate);
        }
        throw new IllegalArgumentException("Unknown mission type");
    }
}
