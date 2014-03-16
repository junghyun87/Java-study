# -*- coding: utf-8 -*-
class Person:
	"""Simple class"""
	Name = "Default Name"
	def Print(self):
		print "My Name is {0}".format(self.Name)

p1 = Person()
p1.Print() 

p1.Name="Kim" #Name variance in instance object
p1.Print()

#order to find variance name or method name
#Instance object area -> class object area -> global area
#member variance can be added or removed in runtime
Person.title = "New title" #add title in class object
print p1.title

p2 = Person()
p1.age = 20
print p1.age
#print p2.age #error

p1.__class__.title="update title" # to access member variance in class namespace
print p1.title
print p2.title

str="Not class member"
class GString:
	str=""
	def Set(self,msg):
		self.str = msg
	def Print(self):
		print str #global variance str. to access str in class namespace, you should use self.str

g = GString()
g.Set("First message")
g.Print()
print g.str

#인스턴스 객체의 클래스 확인
print isinstance(g,GString)

#생성자 소멸자
class MyClass:
	def __init__(self, value):
		self.Value = value #Value is created in instance namespace
		print "Class is created! Value = ", value
	def __del__(self):
		print ("Class is deleted")

def foo():
	d = MyClass(10)

foo()