// 1. Identify Classes, Attributes, Methods, and Relationships

class MeetingRoom {
    private String roomId;
    private int capacity;
    private int floorLocation;

    public MeetingRoom(String roomId, int capacity, int floorLocation) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floorLocation = floorLocation;
    }

    public String getRoomId() { return roomId; }
    public int getCapacity() { return capacity; }
    public int getFloorLocation() { return floorLocation; }
}

class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floorLocation, String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floorLocation);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDeviceId() { return zoomDeviceId; }
    public String getZoomAccountId() { return zoomAccountId; }
}

class Booking {
    private String employeeId;
    private String meetingDate;
    private String meetingTime;
    private int duration;
    private MeetingRoom room;

    public Booking(String employeeId, String meetingDate, String meetingTime, int duration, MeetingRoom room) {
        this.employeeId = employeeId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
        this.room = room;
    }

    public String getEmployeeId() { return employeeId; }
    public String getMeetingDate() { return meetingDate; }
    public String getMeetingTime() { return meetingTime; }
    public int getDuration() { return duration; }
    public MeetingRoom getRoom() { return room; }
}

// 2. Welcome Message Method

public class Lab2 {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }

    // 3. Largest Number Method
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 4. Print Digits in Words
    public static void printDigitsInWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(welcomeMessage("Aadhil"));
        System.out.println("Largest: " + largest(45, 89, 12));
        System.out.print("Digits in Words: ");
        printDigitsInWords(951);
    }
}
