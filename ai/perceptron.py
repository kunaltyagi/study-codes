#! /usr/bin/python

class Perceptron:
    def __init__(self,number_of_inputs=1,number_of_outputs=1,number_of_rules=0):
        self.w=[]
        self.empty=[]
        self.x=[]
        self.rules=[[]]
        self.augmented=[[]]
        self.negated=[[]]
        for i in range(0,number_of_inputs+1):
            self.w.append(0)
            self.empty.append(0)
            self.x.append(0)
        self.x[0]=-1
        self.y=[]
        for i in range(0,number_of_outputs):
            self.y.append(0)
        for i in range(0, number_of_rules):
            rules.append([])
            augmented.append([])
            negated.append([])
        self.inp=number_of_inputs
        self.out=number_of_outputs
        self.logic=number_of_rules

    def signal(self,input_array):
        length=len(input_array)
        if (length == self.inp):
            self.x[1:]=input_array[:]
        elif (length < self.inp):
            self.x[1:]=input_array[:]
            for i in range(length+1,self.inp+1):
                self.x.append(0)
        else:
            for i in range(1,self.inp+1):
                self.x[i]=input_array[i-1]

    def print_x(self,index=-1):
        tmp=[]
        if index==-1:
            print self.x
        elif index<=self.inp :
            print self.x[index]
        else:
            print tmp

    def print_w(self,index=-1):
        tmp=[]
        if index==-1:
            print self.w
        elif index<=self.inp :
            print self.w[index]
        else:
            print tmp

    def print_y(self,index=-1):
        tmp=[]
        if index==-1:
            print self.y
        elif index<=self.inp :
            print self.y[index]
        else:
            print tmp

    def print_rules(self,index=-1):
        tmp=[]
        if index == -1:
            for i in range(0,self.logic):
                print self.rules[i]
        elif index<=self.logic:
            print self.rules[index]
        else:
            print tmp

    def print_augmented(self,index=-1):
        tmp=[]
        if index == -1:
            for i in range(0,self.logic):
                print self.augmented[i]
        elif index<=self.logic:
            print self.augmented[index]
        else:
            print tmp

    def print_negated(self,index=-1):
        tmp=[]
        if index == -1:
            for i in range(0,self.logic):
                print self.negated[i]
        elif index<=self.logic:
            print self.negated[index]
        else:
            print tmp

    def rule(self,rule_array):
        self.rules=rule_array[:]
        self.augmented=rule_array[:]
        self.negated=rule_array[:]
        self.logic=len(self.rules)
        for i in range(0,self.logic):
            self.augmented[i]=[-1]+self.rules[i][:-1]
            self.negated[i]=[-1]+self.rules[i][:-1]
            for j in range(0,len(self.augmented[i])):
                self.negated[i][j]=self.augmented[i][j] if self.rules[i][-1:] !=[0] else self.augmented[i][j]*-1

    def output(self,y_index=0):
        sum=0
        for i in range(0,self.inp):
            sum+=self.w[i]*self.x[i]
        return sum

    def rule_output(self,rule_index=0):
        sum=0
        for i in range(0,len(self.negated[rule_index])):
            sum+=self.w[i]*self.negated[rule_index][i]
        return sum

    def satisfy_w(self,rule_index=0,y_index=0):
        if (self.rule_output(rule_index) > 0):
            return 1
        else:
            for i in range(0,self.inp+1):
                self.w[i]+=self.negated[rule_index][i]
            return 0

    def iterate_w(self,times=75):
        counter=0
        index=0
        for i in range(0,times):
            if counter != 0:
                if self.w==self.empty :
                    print 'Loop'
                    break
            counter+=1
            print counter,index,
            print ':',
            self.print_w()
            if(self.satisfy_w(index,0) == 0):
                index=0
            else:
                index+=1
            if index==self.logic:
                break

if __name__=="main":
    percep=Perceptron()
