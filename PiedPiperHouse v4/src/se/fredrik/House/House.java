package se.fredrik.House;

import java.util.ArrayList;
import java.util.List;

public class House {
  private List<Room> roomList = new ArrayList<>();

  // Methods

  // Open Door
  public void openDoor(String roomName) {
    for (Room room : getRoomList()) {
      if (room.getName().equals(roomName)) {
        room.openDoor();
      }
    }
  }

  // Break Door
  public void breakDoor(String roomName) {
    for (Room room : getRoomList()) {
      if (room.getName().equals(roomName)) {
        room.breakDoor();
      }
    }
  }

  // Open Window
  public void openWindow(String roomName) {
    for (Room room : getRoomList()) {
      if (room.getName().equals(roomName)) {
        room.openWindow();
      }
    }
  }

  // Break Window
  public void breakWindow(String roomName) {
    for (Room room : getRoomList()) {
      if (room.getRoomList().equals(roomName)) {
        room.breakWindow();
      }
    }
  }



  // Add all rooms
  public void addAllRooms() {
    roomList.add(new Room("Garage", true, true, false));
    roomList.add(new Room("Livingroom", true, true, false));
    roomList.add(new Room("Kitchen", false, true, false));
    roomList.add(new Room("Bedroom1", true, true, false));
    roomList.add(new Room("Bedroom2", true, true, true));
    roomList.add(new Room("Bedroom3", true, true, false));
    roomList.add(new Room("Bedroom4", true, true, false));
    roomList.add(new Room("Bedroom5", true, true, false));
    roomList.add(new Room("Hallway", true, true, false));
    roomList.add(new Room("Backyard", false, false, false));
    System.out.println("all rooms added");
  }

  // Add single room
  public void addRoom(Room room) {
    roomList.add(room);
  }

  // Setters and Getters
  public List<Room> getRoomList() {
    return roomList;
  }

  public void setRoomList(List<Room> roomList) {
    this.roomList = roomList;
  }
}
