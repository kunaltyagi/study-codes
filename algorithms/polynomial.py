#! /usr/bin/python

class Polynomial:
    def __init__(self,degre=0):
        self.degree=degre
        self.powers=[]  #stored with index n representing 2**n power
        self.coeff=[]
        self.length=0
        self.binary=''

    def coefficient(self,array=[]): #with index n of array having coefficient of cth power of x
        self.coeff=array[:]
        self.degree=len(array)-1

    def compute(self,x=0):
        self.binary=bin(x)[2:]
        super_add=0
        self.fill_powers(x)
        for i in range(0,self.degree+1):
            bin_power=bin(i)[2:]
            add=0
            product=1
            for j in range(1, len(bin_power)+1):
                if int(bin_power[-j])==1:
                    product*=self.powers[j]
            add+=self.coeff[i]*product
            super_add+=add
        print super_add

    def fill_powers(self,x):
        self.length=len(self.binary)
        index=0
        self.powers=[]
        self.powers.append(1)
        self.powers.append(x)
        product=x
        while index < self.length-1:
            product*=product
            self.powers.append(product)
            index+=1

