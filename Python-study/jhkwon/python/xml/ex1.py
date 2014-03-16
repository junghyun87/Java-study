# -*- coding: utf-8 -*-
#minidom
from xml.dom.minidom import *
xmlsrc = """<item>
	<name>test</name>
	</item>"""
doc = parseString(xmlsrc)
print doc #return Document object
doc.toxml()

def LoadXMLFromFile():
	xmlFD = None
	try:
		xmlFD=open('book.xml')
	except IOError:
		print "invalid file name or path"
		return None
	else:
		try:
			dom = parse(xmlFD)
		except Exception:
			print "loading fail!!"
		else:
			print 'xml doc loading complete'
			return dom
	return None

#Node - parent of Element, attribute, text node.
#Node의 기능을 잘 알아야... dir(Node)

books = parse('book.xml')
booklist = books.childNodes
type(booklist)
len(booklist)
booklist[0]
booklist[0].nodeType
book = booklist[0].childNodes
