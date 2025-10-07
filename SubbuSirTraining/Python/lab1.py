# 1. Function Overloading (Python Style)
def add(*args):
    if all(isinstance(x, (int, float)) for x in args):
        return sum(args)
    else:
        return " ".join(str(x) for x in args)

print(add(10, 20))
print(add(10, 20, 30))
print(add(10.5, 20.1))
print(add("Hello", 20))


# 2. Student Class
class Student:
    def __init__(self):
        self.student_id = 0
        self.student_name = ""
        self.city = ""
        self.marks1 = 0
        self.marks2 = 0
        self.marks3 = 0
        self.fee_per_month = 0.0
        self.is_eligible_for_scholarship = False

    def set_student_id(self, student_id): self.student_id = student_id
    def get_student_id(self): return self.student_id

    def set_student_name(self, student_name): self.student_name = student_name
    def get_student_name(self): return self.student_name

    def set_city(self, city): self.city = city
    def get_city(self): return self.city

    def set_marks1(self, marks1): self.marks1 = marks1
    def get_marks1(self): return self.marks1

    def set_marks2(self, marks2): self.marks2 = marks2
    def get_marks2(self): return self.marks2

    def set_marks3(self, marks3): self.marks3 = marks3
    def get_marks3(self): return self.marks3

    def set_fee_per_month(self, fee_per_month): self.fee_per_month = fee_per_month
    def get_fee_per_month(self): return self.fee_per_month

    def set_is_eligible_for_scholarship(self, status): self.is_eligible_for_scholarship = status
    def get_is_eligible_for_scholarship(self): return self.is_eligible_for_scholarship

    def get_annual_fee(self): return self.fee_per_month * 12
    def get_total_marks(self): return self.marks1 + self.marks2 + self.marks3
    def get_average(self): return self.get_total_marks() / 3
    def get_result(self):
        return "pass" if self.marks1 > 60 and self.marks2 > 60 and self.marks3 > 60 else "fail"


s1 = Student()
s1.set_student_name("Aadhil")
s1.set_marks1(85)
s1.set_marks2(90)
s1.set_marks3(88)
s1.set_fee_per_month(2500)
s1.set_is_eligible_for_scholarship(True)

s2 = Student()
s2.set_student_name("Ravi")
s2.set_marks1(70)
s2.set_marks2(65)
s2.set_marks3(60)
s2.set_fee_per_month(1500)
s2.set_is_eligible_for_scholarship(False)

s3 = Student()
s3.set_student_name("Kumar")
s3.set_marks1(95)
s3.set_marks2(80)
s3.set_marks3(85)
s3.set_fee_per_month(2000)
s3.set_is_eligible_for_scholarship(True)

students = [s1, s2, s3]
highest_total = max(students, key=lambda s: s.get_total_marks())
lowest_fee = min(students, key=lambda s: s.get_fee_per_month())

print("Highest Total Marks:", highest_total.get_student_name())
print("Lowest Fee:", lowest_fee.get_student_name(), lowest_fee.get_fee_per_month())

for s in students:
    print(s.get_student_name(), s.get_total_marks(), s.get_average(), s.get_result(), s.get_is_eligible_for_scholarship())


# 3. Multiplication Table
def table_for(num):
    for i in range(1, 11):
        print(f"{num} x {i} = {num*i}")

def table_while(num):
    i = 1
    while i <= 10:
        print(f"{num} x {i} = {num*i}")
        i += 1

def table_do_while(num):
    i = 1
    while True:
        print(f"{num} x {i} = {num*i}")
        i += 1
        if i > 10:
            break

table_for(2)
table_while(3)
table_do_while(4)


# 4. Word Count
def word_count(s):
    return len(s.split())

print(word_count("Sum of 12 and 20 is 32"))


# 5. String Methods
text = "  Hello Python World  "
print(text[2])
print("Python" in text)
print(len(text))
print(text.find("World"))
print(text == "  Hello Python World  ")
print(text.lower() == "  hello python world  ")
print("-".join(["A", "B", "C"]))
print(text.rfind("o"))
print(text[2:8])
print(text.lower())
print(text.upper())
print(text.strip())


# 6. ArrayStore Class
class ArrayStore:
    def __init__(self):
        self.arr = []

    def accept_elements(self, lst):
        self.arr = lst[:10]

    def display_for(self):
        for i in self.arr:
            print(i, end=" ")
        print()

    def display_while(self):
        i = 0
        while i < len(self.arr):
            print(self.arr[i], end=" ")
            i += 1
        print()

    def sort_array(self):
        self.arr.sort()
        return self.arr

    def count_occurrence(self, num):
        return self.arr.count(num)

    def insert_at(self, pos, num):
        self.arr.insert(pos, num)
        return self.arr

    def unique_elements(self):
        return list(set(self.arr))


a = ArrayStore()
a.accept_elements([9, 2, 2, 9, 10, 9])
a.display_for()
a.display_while()
print(a.sort_array())
print(a.count_occurrence(9))
print(a.insert_at(2, 5))
print(a.unique_elements())
