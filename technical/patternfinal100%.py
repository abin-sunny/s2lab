def sub(a,b):
    return a-b
def pattern(n,down):
    if down:
        print(sub(n,down),end=" ")
        pattern(n,sub(down,1))
        print(sub(n,down),end=" ")
        return
    print(n,end=" ")
n=int(input("enter the number"))
pattern(n,n)

"""
insert a  value n
then print 0 1 2 3 ... n .... 3 2 1 0

constrains:
1,only one operator
2,only one condiction
3,no zero in code
4,only use 1 and n
5, no range function

"""
