import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String status);
}

class ControlCenter implements Observer {
    String name;

    ControlCenter(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " notified: Mission Status - " + status);
    }
}

class MissionStatus {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
