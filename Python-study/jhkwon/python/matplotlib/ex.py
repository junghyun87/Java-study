import matplotlib.pyplot as plt
plt.plot([1,2,3,4])#y-values
plt.ylabel('some numbers')
plt.show()

plt.plot([1,2,3,4], [1,4,9,16], 'ro')#x-values, y-values, red circles
plt.axis([0, 6, 0, 20]) #[xmin, xmax, ymin, ymax]

#numpy arrays. To overcome limit of using lists
import numpy as np
import matplotlib.pyplot as plt
# evenly sampled time at 200ms intervals
t = np.arange(0., 5., 0.2)
# red dashes, blue squares and green triangles
plt.plot(t, t, 'r--', t, t**2, 'bs', t, t**3, 'g^')

#draw line
line, = plt.plot([1,2,3,4], [1,4,9,16], '-')
line.set_antialiased(False)
plt.ylabel('The number of detected faults')
plt.xlabel('Test-cases')
plt.show()

plt.figure(1)
plt.subplot(121) #num of rows, num of columns, figure number
plt.plot([1,2,3,4],[1,4,9,16],'-')
plt.subplot(122)
plt.plot([1,2,3,4],[1,2,3,4],'-')

plt.figure(2) #second figure
plt.plot([1,2,3,4],[1,4,9,16],'-') #default subplot(111)

plt.figure(1) #current pointer: 122
plt.subplot(121) #change it to 121
plt.title('Easy as 1,2,3')
plt.show()

#line width
line, = plt.plot([1,2,3,4], [1,4,9,16], '-', lw=5)
plt.show()

#Annotating text
import numpy as np
import matplotlib.pyplot as plt
fig = plt.figure()
ax = fig.add_subplot(111)
t = np.arange(0.0, 5.0, 0.01)
s = np.cos(2*np.pi*t)
line, = ax.plot(t, s, lw=2)
ax.annotate('local max', xy=(2, 1), xytext=(3, 1.5),
arrowprops=dict(facecolor='black', shrink=0.05),
) #xy: arrow tip, xytext: text location
ax.set_ylim(-2,2)
plt.show()

#http://matplotlib.org/api/pyplot_api.html#matplotlib.pyplot.text
#verticalalignment and horizontalalignment are like alignemnet in a cell in excel.
fig = plt.figure()
ax = fig.add_subplot(111)
ax.plot([1,2,3,4], [1,4,9,16], '-', lw=5)
ax.text(0.5,0.2,'APFD value: 0.4274',horizontalalignment='center',
     verticalalignment='center', transform=ax.transAxes, color='r',size='large');

#save the figure into .eps file
#savefig.dpi : 100 # figure dots per inch
#savefig.facecolor : white # figure facecolor when saving
#savefig.edgecolor : white # figure edgecolor when saving
#savefig.format : png # png, ps, pdf, svg
#savefig.bbox : standard # 'tight' or 'standard'.
savefig('figure.eps', format='eps')
show()

from matplotlib import rc
from numpy import arange, cos, pi
from matplotlib.pyplot import figure, axes, plot, xlabel, ylabel, title, \
grid, savefig, show

rc('text', usetex=True)
rc('font', family='serif')
figure(1, figsize=(6,4))
ax = axes([0.1, 0.1, 0.8, 0.7])
t = arange(0.0, 1.0+0.01, 0.01)
s = cos(2*2*pi*t)+2
plot(t, s)
xlabel(r'\textbf{time (s)}')
ylabel(r'\textit{voltage (mV)}',fontsize=16)
title(r"\TeX\ is Number $\displaystyle\sum_{n=1}^\infty\frac{-e^{i\pi}}{2^n}$!",
fontsize=16, color='r')
grid(True)
savefig('tex_demo')
show()

