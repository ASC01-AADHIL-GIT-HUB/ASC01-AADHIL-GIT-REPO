// 1. Identify Classes, Attributes, Methods, and Relationships

class Room {
    private String id;
    private int capacity;
    private int floor;

    public Room(String id, int capacity, int floor) {
        this.id = id;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getId() { return id; }
    public int getCapacity() { return capacity; }
    public int getFloor() { return floor; }
}

class ZoomRoom extends Room {
    private String zoomDevice;
    private String zoomAccount;

    public ZoomRoom(String id, int capacity, int floor, String zoomDevice, String zoomAccount) {
        super(id, capacity, floor);
        this.zoomDevice = zoomDevice;
        this.zoomAccount = zoomAccount;
    }

    public String getZoomDevice() { return zoomDevice; }
    public String getZoomAccount() { return zoomAccount; }
}

class BookingInfo {
    private String empId;
    private String date;
    private String time;
    private int duration;
    private Room room;

    public BookingInfo(String empId, String date, String time, int duration, Room room) {
        this.empId = empId;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.room = room;
    }

    public String getEmpId() { return empId; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public int getDuration() { return duration; }
    public Room getRoom() { return room; }
}

// 2. Welcome Message Method

public class Lab2Fun {
    public static String sayHi(String name) {
        return "Hey " + name + "! Welcome to Java World 😎";
    }

    // 3. Largest Number Method
    public static int findBiggest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 4. Print Digits in Words
    public static void printNumberInWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(sayHi("Aadhil"));
        System.out.println("Biggest number: " + findBiggest(45, 89, 12));
        System.out.print("Number in words: ");
        printNumberInWords(951);
    }
}
