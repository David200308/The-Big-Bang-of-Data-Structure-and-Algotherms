#include <iostream>

using namespace std;

int main() {
    const int SIZE = 5;
    int a[SIZE] = {5, 2, 4, 9, 7};
    int i, j, min, temp;
    for (i = 0; i < SIZE; i++) {
        min = i;
        for (j = i + 1; j < SIZE; j++) {
            if (a[j] < a[min]) {
                min = j;
            }
        }
        temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
    for (i = 0; i < SIZE; i++) {
        cout << a[i] << " ";
    }
    cout << endl;

    return 0;
}