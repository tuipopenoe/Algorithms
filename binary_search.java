// Tui Popenoe
// binary_search.java

public static void main(String[] args){

}

public static int binary_search(lst, item){
    first = 0
    last = lst.length() -1
    found = false

    while(first <= last && !found){
        mid = (first + last) / 2
        if lst[mid] == item:
            found = true
        else:
            if(item < lst[mid]){
                last = mid - 1
            }
            else{
                first = mid + 1
            }
    return found
    }
}