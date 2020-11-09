# task from -> https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
# !/bin/python3

import math
import os
import random
import re
import sys


# help from - > https://www.youtube.com/watch?v=Uivbf3A725Y&ab_channel=KBTutorials
# Complete the compareTriplets function below.
def compareTriplets(a, b):
    # our local variables
    alice = 0  # this will store the values for alice
    bob = 0  # this will store the values for bob
    result = []  # our result will be store an array/list

    for x in range(len(a)):
        if a[x] > b[x]:
            alice += 1
        elif a[x] < b[x]:
            bob += 1

    result.append(alice)
    result.append(bob)
    if result[0] > result[1]:
        print("Alice won, the score was: ", result)
    elif result[1] > result[0]:
        print("Bob Won, the score was: ", result)
    else:
        print("Its a tie , the score was: ", result)
    return result


# making it a tie
a = [1, 2, 3]
b = [3, 2, 1]
compareTriplets(a, b)

# making alice win
a = [1, 2, 3, 6, 7, 4, 87, 3]
b = [3, 2, 1, 3, 5, 7, 90, 0]
compareTriplets(a, b)

# making bob win
a = [1, 2, 3]
b = [3, 3, 1]
compareTriplets(a, b)

