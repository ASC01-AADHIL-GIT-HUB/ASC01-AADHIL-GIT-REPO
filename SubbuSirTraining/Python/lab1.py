# 1. Function Overloading (Python Style)
def add_stuff(*things):
    if all(isinstance(x, (int, float)) for x in things):
        return sum(things)
    else:
        return " ".join(str(x) for x in things)

print(add_stuff(10, 20))
print(add_stuff(10, 20, 30))
print(add_stuff(10.5, 20.1))
print(add_stuff("Hello", 20))


# 2. Student Class
class Student:
    def __init__(self):
        self.id = 0
        self.name = ""
        self.city = ""
        self.m1 = 0
        self.m2 = 0
        self.m3 = 0
        self.monthly_fee = 0.0
        self.scholarship = False

    def set_id(self, id): self.id = id
    def get_id(self): return self.id

    def set_name(self, name): self.name = name
    def get_name(self): return self.name

    def set_city(self, city): self.city = city
    def get_city(self): return self.city

    def set_marks1(self, m1): self.m1 = m1
    def get_marks1(self): return self.m1

    def set_marks2(self, m2): self.m2 = m2
    def get_marks2(self): return self.m2

    def set_marks3(self, m3): self.m3 = m3
    def get_marks3(self): return self.m3

    def set_fee(self, fee): self.monthly_fee = fee
    def get_fee(self): return self.monthly_fee

    def set_scholarship(self, status): self.scholarship = status
    def has_scholarship(self): return self.scholarship

    def yearly_fee(self): return self.monthly_fee * 12
    def total_marks(self): return self.m1 + self.m2 + self.m3
    def average_marks(self): return self.total_marks() / 3
    def result(self): return "pass" if self.m1 > 60 and self.m2 > 60 and self.m3 > 60 else "fail"


s1 = Student()
s1.set_name("Aadhil")
s1.set_marks1(85)
s1.set_marks2(90)
s1.set_marks3(88)
s1.set_fee(2500)
s1.set_scholarship(True)

s2 = Student()
s2.set_name("Ravi")
s2.set_marks1(70)
s2.set_marks2(65)
s2.set_marks3(60)
s2.set_fee(1500)
s2.set_scholarship(False)

s3 = Student()
s3.set_name("Kumar")
s3.set_marks1(95)
s3.set_marks2(80)
s3.set_marks3(85)
s3.set_fee(2000)
s3.set_scholarship(True)

students = [s1, s2, s3]
top_student = max(students, key=lambda s: s.total_marks())
cheapest = min(students, key=lambda s: s.get_fee())

print("Top Student:", top_student.get_name())
print("Cheapest Fee:", cheapest.get_name(), cheapest.get_fee())

for s in students:
    print(s.get_name(), s.total_marks(), s.average_marks(), s.result(), s.has_scholarship())


# 3. Multiplication Table
def times_table(num):
    for i in range(1, 11):
        print(f"{num} x {i} = {num*i}")

def times_table_while(num):
    i = 1
    while i <= 10:
        print(f"{num} x {i} = {num*i}")
        i += 1

def times_table_do(num):
    i = 1
    while True:
        print(f"{num} x {i} = {num*i}")
        i += 1
        if i > 10:
            break

times_table(2)
times_table_while(3)
times_table_do(4)


# 4. Word Count
def count_words(txt):
    return len(txt.split())

print(count_words("Sum of 12 and 20 is 32"))


# 5. String Methods
txt = "  Hello Python World  "
print(txt[2])
print("Python" in txt)
print(len(txt))
print(txt.find("World"))
print(txt == "  Hello Python World  ")
print(txt.lower() == "  hello python world  ")
print("-".join(["A", "B", "C"]))
print(txt.rfind("o"))
print(txt[2:8])
print(txt.lower())
print(txt.upper())
print(txt.strip())


# 6. ArrayStore Class
class ArrayFun:
    def __init__(self):
        self.nums = []

    def take_nums(self, lst):
        self.nums = lst[:10]

    def show_for(self):
        for n in self.nums:
            print(n, end=" ")
        print()

    def show_while(self):
        i = 0
        while i < len(self.nums):
            print(self.nums[i], end=" ")
            i += 1
        print()

    def sort_nums(self):
        self.nums.sort()
        return self.nums

    def how_many(self, num):
        return self.nums.count(num)

    def add_here(self, pos, num):
        self.nums.insert(pos, num)
        return self.nums

    def just_unique(self):
        return list(set(self.nums))


a = ArrayFun()
a.take_nums([9, 2, 2, 9, 10, 9])
a.show_for()
a.show_while()
print(a.sort_nums())
print(a.how_many(9))
print(a.add_here(2, 5))
print(a.just_unique())
