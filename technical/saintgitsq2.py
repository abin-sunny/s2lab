def highest(num):
    num.sort()
    final=list(map(str,num))
    print (num,"\n",final)
    for i in range (len(final)):
        max=final[i]
        index=i
        for j in range(i+1,len(final)):
            for z in range(len(max)):
                if(z!=(len(max)-1) or len(max)==len(final[j])):
                    if(int(max[z])<int(final[j][z])):
                        max=final[j]
                        index=j
                        break
                    elif(int(max[z])>int(final[j][z])):
                        break
                else:
                    if(len(max)<len(final[j])):
                        if(int(final[j][z+1])>int(max[0])):
                            max=final[j]
                            index=j
        final[index]=final[i]
        final[i]=max
        print(final)
    print(final)


highest([6,3,57,0,90,88,91,9,900])
