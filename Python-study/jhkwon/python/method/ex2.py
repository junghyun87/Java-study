# -*- coding: utf-8 -*-
#인수
def Times(a=10,b=20):
	return a*b
TImes()
TImes(5)

def connectURI(server, port):
	str = "http://" + server + ":" + port
	return str
connectURI(port="8080", server="test.com")
#키워드로 호출한 이후에는 순서에 의한 인수매칭 불가능
connectURI(server="test.com", "8080")

#가변 인수. 튜플로 저장
def test(*args):
	print(type(args))
test(1,2)

#사전형식으로 정의되지 않은 인수 전달 받기
def userURIBuilder(server, port, **user):
	str = "http://" + server + ":" + port +"/?"
	for key in user.keys():
		str += key + "=" + user[key] + "&"
	return str
userURIBuilder("test.com","8080",id='userid',passwd='1234')

#lambda
g=lambda x, y : x*y
g(2,3)
(lambda x: x*x)(3)

#help()
help(print)

#generator- iterator 만드는 도구.

