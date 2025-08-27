'''
string: +--
this string keeps on repeating so on like +--+--+--+--...........
for n>3
for user input n=5
    print +--+-
for input n=7
    print +--+--+
for input n=8
    print +--+--+-
'''

def strprint(n):
    str='+--'
    result=''
    x=0
    if(n%2==0):
        x=n//2-1
    else:
        x=n//2
    result=str*x
    if(len(result)>n):
        for i in range(0,n):
            print(result[i],end='')
    else:
        print(result)
strprint(8)