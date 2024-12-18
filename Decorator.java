abstract class MissionDecorator extends Mission {
    protected Mission mission;

    MissionDecorator(Mission mission) {
        super(mission.name, mission.launchDate);
        this.mission = mission;
    }

    @Override
    void displayMissionDetails() {
        mission.displayMissionDetails();
    }
}

class VIPMissionDecorator extends MissionDecorator {
    VIPMissionDecorator(Mission mission) {
        super(mission);
    }

    @Override
    void displayMissionDetails() {
        mission.displayMissionDetails();
        System.out.println("Feature: VIP Passenger on board.");
    }
}

class SpecialistMissionDecorator extends MissionDecorator {
    SpecialistMissionDecorator(Mission mission) {
        super(mission);
    }

    @Override
    void displayMissionDetails() {
        mission.displayMissionDetails();
        System.out.println("Feature: Mission Specialist assigned.");
    }
}
