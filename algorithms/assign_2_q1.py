#! /usr/bin/python

class Question1:
    def __init__(self, length):
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

    def part_b(self):
        print "Solving part (b):"

    def part_c(self):
        print "Solving part (c):"

    def part_d(self):
        print "Solving part (d):"
