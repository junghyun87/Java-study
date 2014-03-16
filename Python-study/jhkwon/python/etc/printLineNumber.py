import inspect

def getLineNumber():
    return inspect.currentframe().f_back.f_lineno
    #return '' #disable

print "This",getLineNumber()
print "is just",getLineNumber()
pass
print "a test",getLineNumber()
