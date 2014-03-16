def Times(a,b):
	return a*b

#To see the generated function objects
globals()

#To assign a reference to another reference
Times(10,10)
myTimes = Times
myTimes(10,10)

a=10
b=20
def sum1(x,y):
	x=x+5 #immutable. x in global will not change
	print x
	return x+y

print sum1(a,b)
print a

def change(x):
	x[0]='H' #list is mmutable. x's value in global also change.

wordlist = ['J','A','M']
change(wordlist)
print wordlist

#Scoping rule
#search name by this order
#Local -> Global -> Built-in
g=1
def testScope(a):
	global g #if you use global variable in local namespace.
	g = 2
	return g+a
testScope(3)
g

#see built-in function
dir(__builtins__)
