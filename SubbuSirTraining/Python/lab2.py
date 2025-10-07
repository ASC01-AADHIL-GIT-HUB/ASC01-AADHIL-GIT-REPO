# 1. Identify Classes, Attributes, Methods, and Relationships

class MeetingRoom:
    def __init__(self, room_id, capacity, floor_location):
        self.room_id = room_id
        self.capacity = capacity
        self.floor_location = floor_location

class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor_location, zoom_device_id, zoom_account_id):
        super().__init__(room_id, capacity, floor_location)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

class Booking:
    def __init__(self, employee_id, meeting_room, meeting_date, meeting_time, duration):
        self.employee_id = employee_id
        self.meeting_room = meeting_room
        self.meeting_date = meeting_date
        self.meeting_time = meeting_time
        self.duration = duration

class BookingManager:
    def __init__(self):
        self.bookings = {}

    def add_booking(self, booking):
        if booking.meeting_date not in self.bookings:
            self.bookings[booking.meeting_date] = []
        self.bookings[booking.meeting_date].append(booking)

    def get_bookings_by_date(self, date):
        return self.bookings.get(date, [])


# Example execution
room1 = MeetingRoom("R101", 10, 2)
zoom_room = ZoomMeetingRoom("R102", 15, 3, "ZD123", "ZA789")
manager = BookingManager()
booking1 = Booking("E001", room1, "2025-10-07", "10:00", "1h")
manager.add_booking(booking1)
for b in manager.get_bookings_by_date("2025-10-07"):
    print(b.employee_id, b.meeting_room.room_id, b.meeting_time)



# 2. Welcome Message Function
def welcome_message(name):
    return f"Welcome, {name}!"


# 3. Largest Number Function
def largest_number(a, b, c):
    return max(a, b, c)


# 4. Print Digits in Words
def print_digits_in_words(number):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for digit in str(number):
        print(words[int(digit)])

