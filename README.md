
# Binary Search Tree - Iterative

## About

This project implements a Binary Search Tree (BST) in Java.

The main goal is to practice tree operations using iterative methods, without recursion.

## How It Works

A Binary Search Tree follows these rules:

- Smaller values go to the left.
- Greater values go to the right.
- Duplicate values are not inserted.

## Features

- Insert nodes.
- Search and find values during tree operations.
- Traverse the tree using:
  - InOrder
  - PreOrder
  - PostOrder
- Delete nodes with:
  - No children.
  - One child.
  - Two children.

## Project Structure

- `Node.java`: Represents a tree node.
- `Tree.java`: Contains the tree operations.
- `Stack.java`: Implements a stack using linked nodes.
- `StackNode.java`: Represents a node in the stack.
- `Main.java`: Runs the tests.

## Technologies

- Java

## Tests

The project tests:

- Node insertion.
- All three tree traversals.
- Deletion of a leaf node.
- Deletion of a node with one child.
- Deletion of a node with two children.
- Deletion of the root.
- Deletion of a value that does not exist.
- Deletion of the only node in the tree.

## Note

All tree operations are implemented iteratively, without recursive methods.
