//
//  main.cpp
//  DS3
//
//  Created by Naveen Himthani on 16/03/14.
//  Copyright (c) 2014 IIT Bombay. All rights reserved.
//

#include <iostream>
#include <string.h>
#include <time.h>
#include <stdlib.h>


using namespace std;


class dmart
{
    long int id;
    char product[50];
    
public:
     void initialise()
    {
        id =0;
        strcpy(product,"\0");
        
    }
    
    void assign(long int a,char object[50])
    {
        
        id=a;
        strcpy(product,object);
    }
    
    void print()
    {
        cout<<id<<"\t"<<product<<endl;
    }
    
    long int returnid()
    {
        return id;
    }
    
    char* returnProduct()
    {
        return product;
    }
    
    
};











int main()
{
    long int size,i,populate;                            // defining initial size of the array
    char cont;
    long int pos,searchid,foundid;
    int choice;
    long int newid,deleteid,index;
    char newproduct[50];
    int flag1,flag,flag2;
    clock_t tStart ;
    cout<<"Enter the initial size of the empty array for database storage:";
    cin>>size;
    
    cout<<"\nEnter the size which you want to populate( <= size ):";
    cin>>populate;
    
    
        
    
    
    dmart* products = new dmart[size];              // create an array to store data
    srand(time(NULL));
    for (i=0;i<size;i++)                 // populate the array- generate random values for ids and same product name
    {
        if(i<populate)
        {
        products[i].assign(rand()%100000,"Naveen");
        //products[i].print();
        }
    }
   
    
    pos = populate-1;                                   // position of last element
    


   cout<<"The Database has been populated..";   // Interface
    
    
    
    do
    {
        cout<<"Select one of the following:";
        cout<<"\n1.Search a product";
        cout<<"\n2.Add a product";
        cout<<"\n3.Remove a product";
        cout<<"\n4.Size of Database";
        cout<<endl<<endl;
        
        cout<<"\nEnter your choice:";                       // User input
        cin>>choice;
        
        if(choice==1)                                       // Search for a given input id = k*O(n)
        {
            
            cout<<"\nEnter product id to be searched:";
            cin>>searchid;
            flag=0;
            tStart = clock();
            
            for(i=0;i<pos+1;i++)
            {
                foundid=products[i].returnid();
                if(foundid==searchid)
                {
                    products[i].print();
                    flag=1;
                    
                    cout<<"Search time:"<<(double)(clock() - tStart)/CLOCKS_PER_SEC<<endl;
                    break;
                }
            }
            if(flag==0)
                cout<<"\nProduct id not found!!";
            
        }
        
        if(choice==2)                                   // insertion for a given input id and product name = n1*O(1)
        {
            flag2=0;
            cout<<"\nEnter the product id to be added:";
            cin>>newid;
            cout<<"\nEnter new product name:";
            cin>>newproduct;
            tStart = clock();
            if(pos < size-1)                // pos=8, size-1=9
            {
                
                products[pos+1].assign(newid,newproduct);
                pos=pos+1;
                
                
                
                cout<<"\nNew product added....Database updated";
                cout<<"\nTime taken for insertion when there is space in database:"<<(double)(clock() - tStart)/CLOCKS_PER_SEC<<endl;
                flag2=1;
            }

            tStart = clock();
            if(pos>=size-1 && flag2==0)
            {
                dmart* temp = new dmart[size*2];
                for( long int i=0;i<pos+1;i++)
                {
                    temp[i]=products[i];
                    
                    
                }
                delete [] products;
                products = temp;
                pos=pos+1;
                
                size=size*2;
              /*  for(i=0;i<pos+1;i++)
                {
                    cout<<endl;
                    products[i].print();
                } */
                products[pos].assign(newid,newproduct);
               
                
                cout<<"\nNew product added...Database updated";
                cout<<"\nTime required for insertion when there is no space in database and new space has to be created:"<<(double)(clock() - tStart)/CLOCKS_PER_SEC;
                

            }
        }
        
        
        if(choice==3)                                           // deletion for a given input id = n2*O(n)
        {
            cout<<"\nEnter the product id to be deleted:";
            cin>>deleteid;
            flag1=0;
            tStart = clock();
            
            for(i=0;i<pos+1;i++)
            {
                foundid=products[i].returnid();
                if(foundid==deleteid)
                {
                    flag1=1;
                    index=i;
                    break;
                }
            }
            
            for (i=index;i<pos;i++)
            {
                products[i]=products[i+1];
            }
            
            
            
            
                    
                    cout<<"\nThe product was deleted from the database";
                    cout<<"\nTime required for successfull deletion:"<<(double)(clock() - tStart)/CLOCKS_PER_SEC;
            
                        
                        
                    
            
            
            pos=pos-1;
            
            if(flag1==0)
            {
                cout<<"\nThe product id was not found.Sorry:(";
            }
        }
        
        
        
        
        if(choice==4)
        {
            cout<<"\n\nThe size of the database is : "<<pos+1;
        }
        
        cout<<endl;
     
        
        
        
    
    cout<<"\nContinue to main menu?(Y/N):";
        cin>>cont;
        cout<<endl<<endl<<endl;
    }while(cont=='Y' || cont=='y');
  
    
    
    
    
    
    
}
