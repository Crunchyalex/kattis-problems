import sys

infile = sys.stdin
next(infile)
for i in infile:
    num = int(i)
    if(num%2 == 0):
        print(str(num) + ' is even')
    else:
        print(str(num) + ' is odd')
