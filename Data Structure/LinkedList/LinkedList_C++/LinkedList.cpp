#include <iostream>
#include "Node.h"
#include "LinkedList.h"

using namespace std;

int main() {

	LinkedList *ll = new LinkedList;
	Node *node1 = new Node;
	node1->data = 3;
	Node *node2 = new Node;
	node2->data = 777;
	Node *node3 = new Node;
	node3->data = 169;
	Node *node4 = new Node;
	node4->data = 1716;

	cout << "Inserting data...";
	insert(ll, node1);
	insert(ll, node2);
	insert(ll, node3);
	insert(ll, node4);
	cout << "Done." << endl;

	cout << "The data in the linked list: ";
	print(ll);

	/*
		Uncomment below when you have completed the two functions
	*/
	// cout << "Updating node 2...";
	// updateNthNode(ll, 2, 888);
	// cout << "Done." << endl;
	// print(ll);

	// cout << "Updating node 4...";
	// updateNthNode(ll, 4, 551);
	// cout << "Done." << endl;
	// print(ll);

	// cout << "Updating node 10...";
	// bool result = updateNthNode(ll, 10, 123);
	// cout << (result ? "Done." : "Error.") << endl;
	// print(ll);

	// cout << "Deleting node 1...";
	// removeNthNode(ll, 1);
	// cout << "Done." << endl;
	// print(ll);

	// cout << "Deleting node 3...";
	// removeNthNode(ll, 3);
	// cout << "Done." << endl;
	// print(ll);

	// cout << "Deleting node 457...";
	// removeNthNode(ll, 457);
	// cout << (result ? "Done." : "Error.") << endl;
	// print(ll);

	// cout << "The data in the linked list: ";
	// print(ll);

	return 0;
}
