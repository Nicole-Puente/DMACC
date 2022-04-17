import unittest
from class_definitions.student_class import Student


class TestStudentClass(unittest.TestCase):

    def setUp(self):
        self.Packer = Student("Walker", "James", "Business", 2.9)

    def tearDown(self):
        del self.Packer

    def test_object_created_required_attributes(self):
        self.assertEqual(self.Packer.last_name, "Walker")
        self.assertEqual(self.Packer.first_name, "James")
        self.assertEqual(self.Packer.major, "Business")

    def test_object_created_all_attributes(self):
        self.assertEqual(self.Packer.last_name, "Walker")
        self.assertEqual(self.Packer.first_name, "James")
        self.assertEqual(self.Packer.major, "Business")
        self.assertEqual(self.Packer.gpa, 2.9)

    def test_student_str(self):
        self.assertEqual(str(self.Packer), "Walker, James has major Business with gpa: 2.9")

    def test_object_created_error_last_name(self):
        with self.assertRaises(ValueError):
            t_student = Student("123", "Kevin", "Business Intro", 2.9)

    def test_object_created_error_first_name(self):
        with self.assertRaises(ValueError):
            t_student = Student("Bacon", "Kevi4", "Business", 2.9)

    def test_object_not_created_error_gpa(self):
        with self.assertRaises(ValueError):
            t_student = Student("Bacon", "Kevin", "Business", 4.1)
            t_student = Student("Bacon", "Kevin", "Business", -1)


if __name__ == '__main__':
    unittest.main()
