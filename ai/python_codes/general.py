#! /usr/bin/python

def to_int(number='0'):
    i=0
    for j in range(1, len(number)+1):
        i+=(2**(j-1))*int(number[-j])
    return i

def to_str(number=0):
    return bin(number)[2:]
