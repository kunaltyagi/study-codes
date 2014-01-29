#! /usr/bin/python

from perceptron import Perceptron

class And:
    def __init__(self, number_of_inputs):
        self.AND=Perceptron(number_of_inputs)
        self.rules=[]
        self.enable_rules(0)

    def enable_rules(self, depth=0, rule=0):
        if depth == 0:
            for i in range(0, 2**self.AND.inp):
                self.rules.append([])
                for j in range(0,self.AND.inp):
                    self.rules[i].append(0);
        if depth < self.AND.inp:
            self.rules[rule][depth]=0;
            rule=self.enable_rules(depth+1, rule)
            print rule,self.rules[rule]
            rule+=1
            self.rules[rule][depth]=1;
            rule=self.enable_rules(depth+1, rule)
            print rule,self.rules[rule]
        return rule


