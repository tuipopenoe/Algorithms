// Tui Popenoe
// Insertion Sort C++

#include <iostream>

using namespace std;

void insertion_sort(void, int);

int main(){

    return 0;
}

void insertion_sort(void **arr, int n, int(*cmp)(const void *, const void *)){
    int j;
    for(j = 1; j < n; j++){
        int i = j - 1;
        void *val = arr[j];
        while( i >= 0 && cmp(arr[i], val) > 0){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = val;
    }
}

int cmp(const void * a, const void * b){
    const int * a_int_ptr = (const int *)a;
    const int * b_int_ptr = (const int *)b;

    int a_value = *a;
    int b_value = *b;

    return a_value - b_value;
}