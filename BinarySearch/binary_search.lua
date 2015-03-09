#!/usr/bin/env lua

function binary_search(a, x, lo, hi):
    lo = lo or 0
    hi = nil or table.getn(a) - 1
    mid = (lo + hi) / 2
    while lo < hi do
        if a[mid] == x:
            return true
        else if a[mid] < x:
            lo = mid
            mid = (lo + hi) / 2
        else:
            hi = mid
            mid = (lo + hi) / 2
    end
    return -1
end