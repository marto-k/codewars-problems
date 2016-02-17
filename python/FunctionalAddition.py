 
#Description:

#Create a function add(n) which returns a function that always adds n to any number

#addOne = add(1)
#addOne(3) # 4

#addThree = add(3)
#addThree(3) # 6






def add(n):
    return lambda x: x + n