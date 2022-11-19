#include <iostream>

using namespace std;

int main() {
    //binary search
    int array[10] = {0, 2, 4, 5, 8, 11, 23, 45, 67, 89};
    int arraySize = sizeof(array) / sizeof(array[0]);
    int searchKey = 5;
    int low = 0;
    int high = arraySize - 1;
    int mid = 0;
    int index = -1;
    while (low <= high) {
        mid = (low + high) / 2;
        if (array[mid] == searchKey) {
            index = mid;
            break;
        } else if (array[mid] < searchKey) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    if (index != -1) {
        cout << "Found " << searchKey << " at index " << index << endl;
    } else {
        cout << "Not found" << endl;
    }
    



    return 0;
}