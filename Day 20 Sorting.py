

import sys


n = int(raw_input().strip())
a = map(int,raw_input().strip().split(' '))
totalSwaps = 0
for i in range(n):
    thisSwaps = 0
    for j in range(n-i-1):
        if a[j] > a[j+1]:
            a[j],a[j+1] = a[j+1],a[j]
            thisSwaps += 1
    totalSwaps += thisSwaps        
    if thisSwaps == 0:
        break
print "Array is sorted in {} swaps.".format(totalSwaps)
print "First Element: {}".format(a[0])
print "Last Element: {}".format(a[-1])