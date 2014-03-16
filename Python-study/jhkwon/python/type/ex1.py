# -*- coding: utf-8 -*-

print 0o10
print 0x10
print 0b10

print oct(38)
print hex(38)
print bin(38)

print 2**5

print 314e-2

x = 3-4j
print x.imag
print x.real
print x.conjugate()

# divide and get only integer part.
print 5//2

print 'py' 'thon'
print 'py'+'thon'
print 'py'*3


# | p| y| t| h| o|n
# 0  1  2  3  4  5  6
#-6 -5 -4 -3 -2 -1
a="python"
a[0:1]
a[1:4]
a[:2]
a[-2:]
a[:]
a[::2]

str(3.14)
int("47")
float(23)

#print u'가'.decode('utf8')
#print u'\uac00'.encode('utf8')

#list create
#initialize a list to a particular size with an initial value
zeros=[0]*5
listoflists=[[0]*4]*5

#type check
i = 1
type(i) is int #return true

colors=['red','green','gold']
type(colors)
colors.append('blue')
colors.insert(1,'black')
colors.extend(['white','gray'])
colors+=['red']
colors+='red' #different result with one for upper line
colors.index('red')
print colors.index('red',1) #specify starting point
print colors.index('red',1, 5) #specify starting and ending point. if no result, error return
colors.count()
colors.pop()
colors.pop(1) #position you want
colors.remove('gold')
colors.sort()
def mysort(x):
	return x[-1]
colors.sort(key=mysort) #sort by the last character

#set
a={1,2,3}
b={3,4,5}
a.union(b)
a.intersection(b)
a-b
a|b
a&b

#tuple
t=(1,2,3)
a,b=1,2 #multiple assignment = tuple assignment
(a,b)=(1,2)
a,b=1,2
a,b=b,a

#conversion
a=set((1,2,3))
b=list(a)
c=tuple(b)
d=set(c)

#check value in tuple, list, set
1 in a

#dictionary
d=dict(a=1,b=3,c=5)
color={"apple":"red","banana":"yellow"}
color["cherry"]="red"
for c in color.items():
	print c
for k,v in color.items():
	print k,v
for k in color.keys():
	print k
for v in color.values():
	print v

del color['cherry']
color.clear()

#boolean
1<2
1!=2
1==2
True and False
True & True
True or False
False | False
not True

#shallow, deep copy
a = [1,2,3]
b=a
id(a),id(b)
#deep copy
b=a[:]
id(a),id(b)
import copy
b=copy.deepcopy(a)



