#ifndef _GRID_H_
#define _GRID_H_

#include <iostream>
#include <vector>
#include <cmath>

class Cell
{
public:
    Cell()
    {
        value = 0;
        health = 0;
        n = 0;
    }
    int getValue()
    {
        return value;
    }
    int setValue(int val)
    {
        value = val;
    }
    int getN()
    {
        return n;
    }
    int setValue(int val)
    {
        n = val;
    }
    bool join(Cell* link)
    {
        links.push_back(link);
        return true;
    }
    bool remove(Cell* link)
    {
        ;
        return false;
    }
    bool join(int i, int j, int n)
    {
        ;
        return false;
    }
    bool remove(int i, int j, int n)
    {
        ;
        return false;
    }

private:
    int value;
    int n;
    std::vector<Cell*> links;
    enum health { DEAD, SICK, HEALTHY};
    health state;

protected:
};

#endif
