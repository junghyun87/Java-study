money=103

if money>100:
	item="apple"
else:
	item="banana"

item = "apple" if money > 100 else "banana"
item

#intuitive way
score = 75
if 70 <= score < 80:
	print "kkk"

#determin true/false
bool(13)

#short-circuit evaluation
#use 'and', 'or'
a=0
if a and 10/a:
	print "a equals 0"
else:
	print "no error"

l=['Apple',100,15.23]
for i in l:
	print i, type(i)

#break, continue

#range([start], end, [step])
list(range(20))
list(range(5,10))
list(range(10,0,-1))
list(range(10,20,2))

#리스트 항목과 인덱스 값 동시에 얻기
L=[100,15.5, "Apple"]
for i,v in enumerate(L,101):
	print i,v

#list comprehensions
#<표현식> for <아이템> in <시퀀스 타입 객체> (if <조건식>)
l = ["apple","banana","orange","kiwi"]
[i for i in l if len(i)>5]
