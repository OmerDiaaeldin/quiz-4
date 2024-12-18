# Space Shuttle Management App

## Description
The Space Shuttle Management App is a simple Java application demonstrating the use of design patterns. It simulates the management of space shuttle missions, including:

- Creating different types of missions (e.g., Cargo, Exploration).
- Adding optional features to missions (e.g., VIP passengers, mission specialists).
- Notifying mission control centers when mission statuses change.

## Features

### Design Patterns Used
1. **Factory Method**
   - Dynamically create different types of missions.
2. **Decorator**
   - Add optional features to missions without modifying their base structure.
3. **Observer**
   - Notify mission control centers of mission status updates.

### Key Functionalities
- Create cargo and exploration missions.
- Decorate missions with additional features like VIP passengers and specialists.
- Notify multiple control centers of real-time status changes.

## How to Run the App

### Prerequisites
1. Java Development Kit (JDK) installed. Check with:
   ```bash
   java -version
   ```
2. A terminal or IDE for compiling and running the app.

### Steps to Run
1. **Compile the Code:**
   ```bash
   javac Decorator.java Factory.java Observer.java SpaceShuttleApp.java 
   ```

2. **Run the Application:**
   ```bash
   java SpaceShuttleApp
   ```

### Expected Output
```
Cargo Mission: Apollo 1 (Launch Date: 2024-12-25)
Feature: VIP Passenger on board.
Houston Control Center notified: Mission Status - Ready for Launch
Florida Launch Pad notified: Mission Status - Ready for Launch

Exploration Mission: Mars Rover (Launch Date: 2025-01-15)
Feature: Mission Specialist assigned.
Houston Control Center notified: Mission Status - In Progress
Florida Launch Pad notified: Mission Status - In Progress
```

## Using an IDE (Optional)
You can also use an Integrated Development Environment (IDE) like **IntelliJ IDEA**, **Eclipse**, or **VS Code**:
1. Create a new Java project.
2. Import the `src/` folder into the project.
3. Set `SpaceShuttleApp.java` as the main class.
4. Build and run the project directly from the IDE.

## Extending the App
You can extend this app by:
- Adding new mission types (e.g., RescueMission).
- Creating more decorators (e.g., adding special cargo).
- Enhancing the observer pattern to include logging or analytics.

## License
This project is open-source and available for educational purposes.

---
Feel free to modify and expand the app as you see fit!

