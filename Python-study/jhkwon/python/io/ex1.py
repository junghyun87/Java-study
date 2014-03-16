s = 'Hello, world.'
str(s) #human-readable
repr(s) #read by the interpreter
hello = 'hello, world\n'
print hello
hellos = repr(hello)
print hellos

#str.rjust, str.ljust, str.center
for x in range(1,11):
	print repr(x).rjust(2), repr(x*x).rjust(3),
	print repr(x*x*x).rjust(4)

for x in range(1,11):
	print '{0:2d} {1:3d} {2:4d}'.format(x,x*x,x*x*x)


#str.zfill
'12'.zfill(5)
'-3.14'.zfill(7)
'3.1415926458'.zfill(5)

#str.format()
print 'We are the {} who say "{}!"'.format('knights', 'Ni')
print '{0} and {1}'.format('spam', 'eggs')
print 'This {food} is {adjective}.'.format(food='spam', adjective='absolutely horrible')

#An optional ':' and format specifier can follow the field name
import math
print 'The value of PI is approximately {0:.3f}.'.format(math.pi)

table = {'Sjoerd': 4127, 'Jack': 4098, 'Dcab': 7678}
for name, phone in table.items():
	print '{0:10} ==> {1:10d}'.format(name, phone)

table = {'Sjoerd': 4127, 'Jack': 4098, 'Dcab': 8637678}
print ('Jack: {0[Jack]:d}; Sjoerd: {0[Sjoerd]:d}; Dcab: {0[Dcab]:d}'.format(table))

table = {'Sjoerd': 4127, 'Jack': 4098, 'Dcab': 8637678}
print 'Jack: {Jack:d}; Sjoerd: {Sjoerd:d}; Dcab: {Dcab:d}'.format(**table)

#old string formatting
print 'The value of PI is approximately %5.3f.' % math.pi

#input
#nb = raw_input('Choose a number: ')
#print nb

#file i/o
f = open('test.txt','w')
f.write('plow deep\nwhile sluggards sleep')
f.close()

f = open('test.txt')
print f.read()
f.close()
print f.closed

#binary mode
f=open('canon2.mp3','wb')
f.write(open('canon.mp3','rb').read())
f.close()

#readline - return one line as string
#readline - return list consisting of lines
f = open('test.txt')
f.read()
f.read()
f.tell() #check current location
f.seek(0) #start over from the beginning
f.readline()
f.readline()
f.readline()
f.seek(0)
f.readlines()
f.readlines()
f.close()

#with
#f will be closed automatically after with block
with open('test.txt') as f:
	print f.readlines()
	print f.closed
print f.closed

#pickle
#save list and class instead of string
colors = ['red','green','black']
import pickle
f = open('colors','wb')
pickle.dump(colors,f)
f.close()

del colors
f=open('colors','rb')
colors = pickle.load(f)
f.colose()
colors

#save and load class
class test:
	var = None
a = test()
a.var='Test'
f = open('test','wb')
pickle.dump(a,f)
f.close()
f = open('test','rb')
b = pickle.load(f)
f.close()
b