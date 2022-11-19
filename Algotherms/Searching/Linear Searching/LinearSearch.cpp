#include <iostream>

using namespace std;

int main() {
    int size = 7;
    int nums[size] = {1, 2, 3, 4, 5, 6, 7};
    int target = 5;
    int count = 0;

    for (int i = 0; i < size; i++) {
        count++;
        if (target == nums[i]) {
            cout << "Find! " << "Index of " << target << ": " << count - 1 << endl;
            break;
        } else {
            cout << "Not Find!" << endl;
        }
    }

    return 0;
}