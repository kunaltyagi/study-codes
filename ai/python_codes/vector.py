#! /usr/bin/python

from general import *

class Vector:
    def __init__(self,length=0):
        self.array=[]
        self.length=length
        for i in range(0,length):
            self.array.append(0)

    def fill(self,x):
        self.length=x.length
        self.array=x.array[:]

    def set(self,x):
        self.length=len(x)
        self.array=x[:]

    def add(self,x):
        if x.length<self.length:
            for i in range(0,x.length):
                self.array[i]+=x.array[i]
        elif x.length>self.length:
            for i in range(self.length,x.length):
                self.array.append(x.array[i])
            self.length=x.length

    def negate(self):
        for i in range(0, self.length):
            self.array[i]*=-1

    def dot(self,x):
        tmp=0
        if x.length<self.length:
            length=x.length
        else:
            length=self.length
        for i in range(0, length):
            tmp+=self.array[i]*x.array[i]

    def equals(self,x):
        if x.length==self.length:
            for i in range(0, self.length):
                if x.array[i]!=self.array[i]:
                    return 0
            return 1
        else:
            return 0


"""
#not for this class
    def make_tt(self,length=0):
        for i in range(0, length):
            self.array.append([])
            string=bin(length)[2:]
            for j in range(0, len(string)):
                self.array[i].append(int(string[j]))
        print self.array
"""
