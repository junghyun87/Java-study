#http://stackoverflow.com/questions/5485473/reading-values-from-csv-and-drawing-bar-chart-with-matplotlib-in-python
import csv

res = csv.reader(open('sample_fault_matrix.csv'), delimiter=',')
the_number_of_fault = res.next() #when you don't want to read header
print the_number_of_fault[0]

fault_matrix={}
i = 1
for col in res:
	fault_matrix[col[0]]=tuple(col[1:])

print fault_matrix
