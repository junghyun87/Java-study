#http://glowingpython.blogspot.kr/2011/04/how-to-use-twitter-search-api.html
import urllib2
search = urllib2.urlopen("http://search.twitter.com/search.json?q=fc+liverpool")
response = search.read()

import json
data = json.loads(response)
results=data['results']
results[0]['text']

#the number of tweets
#searchTweets("fc+liverpool&rpp=50")



