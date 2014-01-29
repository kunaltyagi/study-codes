#! /usr/bin/python

from vector import Vector

class TruthTable:
    def __init__(self,length=0):
        self.table=[]
        self.length=length;
        self.size=2**length;
#store only the true values, not the false ones

    def enter_val_tt(self,length=0):
        self.length=length
        self.size=2**length
        tmp=[]
        ans=0
        print "Enter output for the following inputs: "
        for i in range(0, size):
            tmp=bin(size)[2:]
            ans=raw_input(tmp+": ")
            if ans==1:
                table.append(i)

    def value(self,rule=0):
        if rule in table:
            return 1
        return 0


    def enter_vec_tt(self, vector):
        return

    def full_tt(self, table):
        j=0
        string=''
        for i in range(0,len(table)):
            j=len(table[i])
            if table[i][j-1] > 0:
                for k in range(0,j):
                    string.append(str(table[i][j]))
                self.table.append(to_int(string))
        return

    def vactor_tt(self, vector):
        return
