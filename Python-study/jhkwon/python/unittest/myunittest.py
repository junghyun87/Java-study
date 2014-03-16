#http://docs.python.org/2/library/unittest.html

import random
import unittest

class TestSequenceFunctions(unittest.TestCase):

    #setUp : create a fresh sequence for each test.
    def setUp(self):
        self.seq = range(10)

    def test_shuffle(self):
        # make sure the shuffled sequence does not lose any elements
        random.shuffle(self.seq)
        self.seq.sort()
        self.assertEqual(self.seq, range(10))

        # should raise an exception for an immutable sequence
        self.assertRaises(TypeError, random.shuffle, (1,2,3)) #verify that an expected exception gets raised.

    def test_choice(self):
        element = random.choice(self.seq)
        self.assertTrue(element in self.seq)

    def test_sample(self):
        with self.assertRaises(ValueError):
            random.sample(self.seq, 20)
        for element in random.sample(self.seq, 5):
            self.assertTrue(element in self.seq)

if __name__ == '__main__':
    # command-line interface to the test script
    #unittest.main()
    #Other way
    suite = unittest.TestLoader().loadTestsFromTestCase(TestSequenceFunctions)
    unittest.TextTestRunner(verbosity=2).run(suite)

#The unittest module can be used from the command line to run tests from modules, classes or even individual test methods:
#python -m unittest test_module1 test_module2  #module
#python -m unittest test_module.TestClass #Class
#python -m unittest test_module.TestClass.test_method #Method

#python -m unittest -h #help