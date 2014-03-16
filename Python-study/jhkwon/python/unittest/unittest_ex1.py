#http://docs.python.org/2/library/unittest.html

import unittest

class WidgetTestCase(unittest.TestCase):
    #This is called immediately before calling the test method
    def setUp(self):
        self.widget = Widget('The widget')

    #Method called immediately after the test method has been called and the result recorded
    def tearDown(self):
        self.widget.dispose()
        self.widget = None
    
    # for test-cases, prefix test_
    def test_default_size(self):
        self.assertEqual(self.widget.size(), (50,50),
                         'incorrect default size')

    def test_resize(self):
        self.widget.resize(100,150)
        self.assertEqual(self.widget.size(), (100,150),
                         'wrong size after resize')

#passing the method name in the constructor
#defaultSizeTestCase = WidgetTestCase('test_default_size')
#resizeTestCase = WidgetTestCase('test_resize')

#TestSuite
widgetTestSuite = unittest.TestSuite()
widgetTestSuite.addTest(WidgetTestCase('test_default_size'))
widgetTestSuite.addTest(WidgetTestCase('test_resize'))

#Loading and runnig tests
#unittest.main() #simple way
unittest.TextTestRunner(verbosity=2).run(widgetTestSuite)


#it is a good idea to provide in each test module a callable object that returns a pre-built test suite
# def suite():
#     suite = unittest.TestSuite()
#     suite.addTest(WidgetTestCase('test_default_size'))
#     suite.addTest(WidgetTestCase('test_resize'))
#     return suite

#run tests for the whole system at once
# suite1 = module1.TheTestSuite()
# suite2 = module2.TheTestSuite()
# alltests = unittest.TestSuite([suite1, suite2])

