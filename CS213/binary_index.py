#! /usr/bin/python

#N<=2^n
def numCompar(index, n):
    steps = n
    for i in range(0,n):
        if (index>>i) & 1 == 1 :
            steps = n-i
            break

    return steps

for i in range(0,33):
    print numCompar(i,5),
