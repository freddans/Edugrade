package alarmsystem.detectors;

import alarmsystem.detectors.parts.*;

import java.util.ArrayList;
import java.util.List;

public class Room {
  // Attributes
  private String name;
  private boolean secretDocuments = false;

  // Lists
  private List<Detector> detectorList = new ArrayList<>();

  // Constructor
  public Room(String name) {
    this.name = name;
  }

  // Methods
  public void addDetector(Detector detector) {
    detectorList.add(detector);
  }

  public void removeDetector(String name) {
    Detector removeDetector = null;
    for (Detector detector : detectorList) {
      if (detector.getName().equalsIgnoreCase(name)) {
        removeDetector = detector;
      }
    }
    detectorList.remove(removeDetector);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setSecretDocuments(boolean secretDocuments) {
    this.secretDocuments = secretDocuments;
  }

  public boolean isSecretDocuments() {
    return secretDocuments;
  }

  public List<Detector> getDetectorList() {
    return detectorList;
  }
}
