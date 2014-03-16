print all([True, True, True, False, True, True])
print any([True, True, True, False, True, True])

#NOTE: 'all' and 'any' short-circuit

#Aside: all and any take iterables (and sequences)
def counting_generator():
    counting_generator.count += 1
    if counting_generator.count < 100:
        yield True

counting_generator.count = 0
print "The result was %r and produced %d items" % (any(counting_generator()), counting_generator.count)
counting_generator.count = 0
# if you don't include the if statement this will be an infinite loop!
print "The result was %r and produced %d items" % (all(counting_generator()), counting_generator.count)

#Truthiness in Python
#https://www.udacity.com/wiki/cs258/Truthiness_in_Python
