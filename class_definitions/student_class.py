"""
Program: student_class.py
Author: Nicole Puente
Last Modified: 04/16/22
This program will implement the use of unit testing
"""


class Student:

    """Student class"""
    def __init__(self, lname, fname, major, gpa=0.0):
        self.last_name = lname
        self.first_name = fname
        self.major = major
        self.gpa = gpa

        characters = set("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ")
        gpa_characters = set("0123456789'.")

        if not (characters.issuperset(lname) and characters.issuperset(fname)):
            raise ValueError
        if not characters.issuperset(major):
            raise ValueError
        if not gpa_characters.issuperset(str(gpa)):
            raise ValueError
        if gpa < 0.00 or gpa > 4.0:
            raise ValueError

        result = isinstance(gpa, float)
        print(result)

    def __str__(self):
        return self.last_name + ", " + self.first_name + " has major " + self.major + " with gpa: " + str(self.gpa)


def main():
    student_one = Student("Johnson", "John", "Comp Sci", 4.0)
    student_two = Student("Smith", "Becky", "Accounting", 3.8)
    print(student_one)
    print(student_two)


if __name__ == '__main__':
    main()
