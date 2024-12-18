public class SpaceShuttleApp {
    public static void main(String[] args) {
        // Factory Method: Create missions
        Mission cargoMission = MissionFactory.createMission("Cargo", "Apollo 1", "2024-12-25");
        Mission explorationMission = MissionFactory.createMission("Exploration", "Mars Rover", "2025-01-15");

        // Decorator: Add features to missions
        Mission vipCargoMission = new VIPMissionDecorator(cargoMission);
        Mission specialistExplorationMission = new SpecialistMissionDecorator(explorationMission);

        // Observer: Mission status updates
        MissionStatus missionStatus = new MissionStatus();
        ControlCenter houston = new ControlCenter("Houston Control Center");
        ControlCenter florida = new ControlCenter("Florida Launch Pad");

        missionStatus.addObserver(houston);
        missionStatus.addObserver(florida);

        // Display details and change status
        vipCargoMission.displayMissionDetails();
        missionStatus.setStatus("Ready for Launch");

        specialistExplorationMission.displayMissionDetails();
        missionStatus.setStatus("In Progress");
    }
}
