#! /usr/bin/python

def prefix_avg1(X, index=-1):
    A=[]
    add=0
    for i in range(0,len(X)):
        add+=X[i]
        A.append(float(add)/(i+1))
    if index!= -1:
        print A[index]
    else:
        for i in range(0, len(X)):
            print A[i],

def prefix_avg2(X, index=-1):
    A=[]
    add=0
    A.append(0)
    for i in range(0,len(X)):
        A.append( float(i*A[i]+X[i])/(i+1) )
    if index!= -1:
        print A[index]
    else:
        for i in range(1, len(X)+1):
            print A[i],
