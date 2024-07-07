def sub(b,a=None):
    return a-b
def dec(a):
    return sub(1,a)
def pattern(a,b):
    temp=sub(b,a)
    if b:
        print(temp,end=" ")
        pattern(a,dec(b))
        print(temp,end=" ")
        return
    print(a,end=" ")
    return
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


udgugd"
