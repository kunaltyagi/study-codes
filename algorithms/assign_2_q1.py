#! /usr/bin/python

class Question1:
    def __init__(self, length=0):
        self.array=[]
        self.options = { 0 : self.none,
                         1 : self.part_a,
                         2 : self.part_b,
                         3 : self.part_c,
                         4 : self.part_d,
                       }
        for i in range(0,length):
            self.array.append(0);
        self.length = length;
        self.part = 0;  //0:none, 1:a, 2:b, 3:c 4:d
        self.longest = 0

    def inp_array(self,inp_arr):
        self.array=[]
        for i in range(0,len(inp_arr)):
            self.array.append(inp_arr[i])
        self.length=len(inp_arr)

    def solve(self, par):
        self.part = par;
        if self.part < 0 or self.part > 4 or len(self.array) == 0:
            self.part = 0
        self.options[self.part]();

    def none(self):
        print "No correct mode selected"

    def part_a(self):
        print "Solving part (a):"
        length=0
        while i < self.length-1:
            """
            check before if possible, if true, go and return
            the length.
            check after if possible, if true, go and return
            the length.
            add them and 1. if larger than longest, increase
            longest, else move onto the next point and repeat
            """
            length+=check_forward_a(i)+check_backward_a(i)+1
            if length>self.longest:
                self.longest=length
            i+=self.longest+1
        print self.longest

    def check_forward_a(self,pos):
        seq=0
        while pos < self.length-1:
            if self.array[pos]<self.array[pos+1]:
                seq+=1
                pos+=1
            else:
                break
        return seq
    def check_backward_a(self,pos):
        seq=0
        while pos > 1:
            if self.array[pos]>self.array[pos-1]:
                seq+=1
                pos-=1
            else:
                break
        return seq

    def part_b(self):
        print "Solving part (b):"

    def part_c(self):
        print "Solving part (c):"

    def part_d(self):
        print "Solving part (d):"
