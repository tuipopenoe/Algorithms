// Tui Popenoe
// Binary Search C++

#include <iostream>

using namespace std;


int binary_search(int[], int, int, int)

int main(){

    return 0;
}

int binary_search(int array, int target, int lo, int hi){
    int mid = (lo + hi) / 2;

    while (lo < hi) {
        if(array[mid] == target) {
            return mid;
        }
        else if(array[mid] > array[lo]){
            lo = mid;
            mid = (lo + hi) / 2;
        }
        else{
            hi = mid;
            mid = (lo = hi) / 2;
        }
    }
    // Target not found
    return -1;
}