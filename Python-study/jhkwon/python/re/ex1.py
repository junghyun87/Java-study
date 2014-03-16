import re

print re.findall(r"[0-9]","1 + 2 == 3")
re.findall(r"[a-c]", "Barbara Liskov")

#Concatenation
print re.findall(r"[0-9][0-9]", "July 28, 1821")

#one or more
print re.findall(r"[0-9]+", "13 from 1 in 1776")

#Disjunction
re.findall(r"[a-z]+|[0-9]+", "Goethe 1749")

#Option
print re.findall(r"-?[0-9]+", "1861-1941 R. Tagore")

#Escape Sequences
#r"\+\+"

#. any character except a new line
re.findall(r"[0-9].[0-9]", "1a1 222 cc3")

#^ "not" or "set complement" or "everything except" if it is used just inside [square brackets].
print re.findall("[0-9][^a-b]", "1a1 222 2b2 cc3")

#Structure
print re.findall(r"do+|re+|mi+","mimi rere midore doo-wop")
print re.findall(r"(?:do+|re+|mi)+","mimi rere midore doo-wop")

