#include <iostream>

using namespace std;

int main() {
    int a[] = {2, 4, 1, 3, 5};
    // bubbleSort
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 4 - i; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < 5; i++) {
        cout << a[i] << " ";
    }

    return 0;
}