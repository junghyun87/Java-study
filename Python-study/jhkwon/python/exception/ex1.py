def divide(a,b):
	return a/b

try:
	c=divide(5,2)
except ZeroDivisionError:
	print "second argument shouldn'nt be zero"
except TypeError:
	print "all argument should be number"
except:
	print "other errors"
else:
	print 'Result: {0}'.format(c)
finally:
	print 'this block is always carried out'

try:
	c = divide(5,'af')
except TypeError as e:
	print 'error: ',e.args[0]
except Exception:
	print 'i dunno..'

try:
	c = divide(5,0)
except (ZeroDivisionError, OverflowError, FloatingPointError):
	print 'error related to number calculation'
except Exception:
	print 'i dunno..'

#generate Exception
try:
	raise NameError
except:
	print "NameError is Catched"


#exception propagation
def RaiseErrorFunc():
	raise NameError("NameError argument")

def PropagateError():
	try:
		RaiseErrorFunc()
	except:
		print 'This message firstly show up before error propagation'
		raise #deliver error to the upper level

PropagateError() #call stack info, argument from raise


#assert
#assert <condition>, <related data>
def foo(x):
	assert type(x) == int, "Input value must be integer"
	return x*10

ret = foo('a')
print (ret)

#if you set -O option, assert will not be executed.
#python -O ex1.py