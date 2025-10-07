# 1. Identify Classes, Attributes, Methods, and Relationships (more casual style)

class Room:
    def __init__(self, room_id, capacity, floor):
        self.room_id = room_id
        self.capacity = capacity
        self.floor = floor

class ZoomRoom(Room):
    def __init__(self, room_id, capacity, floor, zoom_device, zoom_account):
        super().__init__(room_id, capacity, floor)
        self.zoom_device = zoom_device
        self.zoom_account = zoom_account

class Booking:
    def __init__(self, emp_id, room, date, time, duration):
        self.emp_id = emp_id
        self.room = room
        self.date = date
        self.time = time
        self.duration = duration

class BookingBook:
    def __init__(self):
        self.all_bookings = {}

    def add_booking(self, booking):
        if booking.date not in self.all_bookings:
            self.all_bookings[booking.date] = []
        self.all_bookings[booking.date].append(booking)

    def show_bookings_for(self, date):
        return self.all_bookings.get(date, [])


# Example usage
room1 = Room("R101", 10, 2)
zoom_room = ZoomRoom("R102", 15, 3, "ZD123", "ZA789")
booker = BookingBook()
booking1 = Booking("E001", room1, "2025-10-07", "10:00", "1h")
booker.add_booking(booking1)
for b in booker.show_bookings_for("2025-10-07"):
    print(b.emp_id, b.room.room_id, b.time)


# 2. Welcome Message Function (casual)
def say_hi(name):
    return f"Hey {name}, welcome aboard!"

# 3. Largest Number Function (casual)
def biggest_num(a, b, c):
    return max(a, b, c)



# 4. Print Digits in Words (casual)
def digits_to_words(num):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for digit in str(num):
        print(words[int(digit)])

