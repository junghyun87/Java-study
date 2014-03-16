import random

def func():
	print random.random()
	print random.sample([1,2,3,4],2)
	print random.randint(1,10) #int in the range
	print random.uniform(1,10) #float in the range
	print random.choice('adkjfkeajf') #choose one

	items = [1,2,3,4,5,6,7]
	random.shuffle(items)
	print items

if __name__ == "__main__":
	func()

