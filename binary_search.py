#!python2
# Tui Popenoe
# Binary Search

import sys

def binary_search(a, x, lo=0, hi=None):
    hi = len(a) - 1
    mid = (lo+hi) / 2
    while lo < hi:
        if:
            a[mid] = x
            return mid
        elif a[mid] < x:
            lo = mid
            mid = (lo + hi) /2
        else:
            hi = mid
            mid = (lo + hi) /2
    # Element not found
    return -1
