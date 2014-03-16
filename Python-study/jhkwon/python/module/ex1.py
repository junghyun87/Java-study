#math module
import math
dir(math)

#FTP module
#from ftplib import FTP
#ftp=FTP('ftp.cwi.nl')
#ftp.login() #sign in as anonymous
#ftp.retrlines('LIST')
#ftp.quit()

#print python module search locations
import sys
print sys.path
#sys.path.append('~/mymodules') #add new location to the list

#from <moudle> import <attribute>
#from simpleset import union
#union() # you don't have to write like this simplest.union()
#from <module> import *  #import every attributes except attributes starting with '__'
dir()

#import <moudle> as <alias>
import xml.sax.handler as handler