#!python
# Tui Popenoe
# quick_sort.py

import sys

def partition(lst, start, end):
    # Partition around last value
    pivot = lst[end]
    # Start outside partitioned area
    bottom = start - 1
    top = end

    done = 0
    while not done:
        while not done:
            bottom = bottom + 1
            if bottom == top:
                done = 1
                break
            if lst[bottom] > pivot:
                lst[top] = lst[bottom]
                break
        while not done:
            top = top - 1
            if top == bottom:
                done = 1
                break
            if lst[top] < pivot:
                lst[bottom] = lst[top]
                break
    lst[top] = pivot
    return top

def quicksort(lst, start, end):
    if start < end:
        split = partition(lst, start, end)
        quicksort(lst, start, split - 1)
        quicksort(lst, split + 1, end)
    else:
        return

def main():
    lst = map(int, sys.argv[1:])
    start = 0
    end = len(lst) - 1
    quicksort(lst, start, end)
    print( ' '.join(map(str, lst)))