#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include "Node.h"
#include <iostream>
using namespace std;

struct LinkedList {
	Node *head = NULL;
};

bool isEmpty(LinkedList *ll) {
	return ll->head == NULL;
}

void print(LinkedList *ll) {
	for (Node *ptr = ll->head; ptr != NULL; ptr = ptr->nextPtr) {
		cout << ptr->data << " ";
	}
	cout << endl;
}


void insert(LinkedList *ll, Node *p) {
	// special case
	if (ll->head == NULL) {
		ll->head = p;
	}
	else {
		Node* currentPtr = ll->head;
		Node* ptr = ll->head->nextPtr;
		while (ptr != NULL) {
			currentPtr = ptr;
			ptr = ptr->nextPtr;
		}
		currentPtr->nextPtr = p;
	}
}

bool remove(LinkedList *ll, int n) {
	if (isEmpty(ll)) { return false; }
	Node* q = ll->head;
	// handling the head case
	if (q->data == n) {
		if (q->nextPtr != NULL) {
			ll->head = q->nextPtr; // The next node becomes the head
		}
		else {
			ll->head = NULL; // The list become empty          
		}
		delete q;
		return true;
	}
	else {
		Node* p = ll->head;
		q = p->nextPtr;
		while (q != NULL) {
			if (q->data == n) {
				p->nextPtr = q->nextPtr;
				delete q;
				return true;
			}
			p = q;
			q = q->nextPtr;
		}
		return false;
	}
}

#endif
