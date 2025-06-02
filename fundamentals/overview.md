# 🧱 Basic Data Structures Overview

A quick reference guide to common data structures, their properties, and time complexities. Each one is optimized for different operations.

---

## 📦 Array

* A contiguous block of memory storing elements.
* Example: `[0, 3, 4, 5, 6, 7, 1]`
* **Access by index**: Fast → `O(1)`
* **Insert/remove in the middle or beginning**: Slow → `O(n)` (requires shifting elements)
* Memory layout may require resizing or moving the whole array.

---

## 🔑 Hash Map (Dictionary)

* Stores key-value pairs.
* Provides quick lookup, insertion, and deletion.
* **Average case**: `O(1)` for most operations.
* **Worst case**: `O(n)` if many keys hash to the same bucket (collisions).

---

## 🔗 Linked List

* A series of nodes, each pointing to the next (singly linked).
* Start at the **head** and traverse node by node.

**Operations:**

* **Insert/remove at beginning**: Fast → `O(1)`
* **Insert/remove at end or middle**: Slow → `O(n)` (requires traversal)
* **Access specific item**: Slow → `O(n)` (must traverse until you find it)

---

## ⏱ Summary Table

| Operation / Structure | Array  | Hash Map | Linked List |
| --------------------- | ------ | -------- | ----------- |
| Access by Index       | O(1)   | –        | O(n)        |
| Insert at Beginning   | O(n)   | O(1)     | O(1)        |
| Insert at End         | O(1)\* | O(1)     | O(n)        |
| Search by Key         | O(n)   | O(1)     | O(n)        |
| Remove by Key/Index   | O(n)   | O(1)     | O(n)        |

> `*` O(1) for arrays only if there’s space available. Otherwise, O(n) due to resizing.

---

## 📚 Tips

* Use **arrays** when you need fast access by index.
* Use **hash maps** for fast lookup by key.
* Use **linked lists** when frequent insertions/removals at the beginning are needed.

---
