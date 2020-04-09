def moveZeros(aList):
    for i in range(len(aList)):
        if aList[i] == 0:
           aList.remove(0)
           aList.append(0)
        else:
           pass #do nothing
    return aList

#print(moveZeros([0,1,0,3,0,10,0,0,12]))
#print(moveZeros([0,1,5,0,15,0,18,0,0,0,45]))



def findIndex(aList, value):
    for i in range(len(aList)):
        if aList[i] == value:
            return i
        elif aList[i] > value:
            return i
        else:
            pass


#print(findIndex([3,8,15,21,35,68,92,99,102], 75))
#print(findIndex([10,8,15,17,21,29,35,68,74,92,98,102,204], 102))






