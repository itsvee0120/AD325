
# AVL Tree Operations Assignment

This assignment focuses on understanding and visualizing the operations (insertion, deletion, and searching) on AVL Trees. Students will manually draw the steps involved in these operations, highlighting the balancing mechanisms (rotations) and analyzing their impact on efficiency.

---

## Objectives

1. Illustrate the key operations (insertion, deletion, and searching) on AVL Trees.
2. Understand the balancing mechanisms (rotations) in AVL Trees.

---

## Assignment Tasks

### 1. Drawing Operations on AVL Trees

#### **Insertion**
Insert the following sequence of numbers into an AVL Tree: **15, 10, 20, 8, 12, 17, 25**. After each insertion, check the balance factor and perform rotations if necessary.


#### 1. Insert 15:
```
15
```
- The tree is balanced.

---

#### 2. Insert 10:
```
     15
    /
   10
```
- The tree is balanced.

---

#### 3. Insert 20:
```
     15
    /  \
   10   20
```
- The tree is balanced.

---

#### 4. Insert 8:
```
      15
    /   \
   10   20
  /
8
```
- **Balance Factor of Node 15**: Left subtree height = 2, Right subtree height = 1. Balance factor = 1 (balanced).
- **Balance Factor of Node 10**: Left subtree height = 1, Right subtree height = 0. Balance factor = 1 (balanced).
- The tree is balanced.

---

#### 5. Insert 12:
```
        15
       /  \
      10   20
     /  \
    8    12
```
- **Balance Factor of Node 15**: Left subtree height = 2, Right subtree height = 1. Balance factor = 1 (balanced).
- **Balance Factor of Node 10**: Left subtree height = 1, Right subtree height = 1. Balance factor = 0 (balanced).
- The tree is balanced.

---

#### 6. Insert 17:
```
        15
       /  \
      10   20
     /  \   /
    8    12 17
```
- **Balance Factor of Node 15**: Left subtree height = 2, Right subtree height = 2. Balance factor = 0 (balanced).
- **Balance Factor of Node 20**: Left subtree height = 1, Right subtree height = 0. Balance factor = 1 (balanced).
- The tree is balanced.

---

#### 7. Insert 25:
```
        15
       /  \
      10   20
     /  \   / \
    8    12 17 25
```
- **Balance Factor of Node 15**: Left subtree height = 2, Right subtree height = 2. Balance factor = 0 (balanced).
- **Balance Factor of Node 20**: Left subtree height = 1, Right subtree height = 1. Balance factor = 0 (balanced).
- The tree is balanced.


### **Final AVL Tree**
```
        15
       /  \
      10   20
     /  \   / \
    8    12 17 25
```

---

Let’s carefully go through the **deletion steps** for the AVL Tree and ensure that the tree remains balanced after each deletion. We'll start with the final AVL Tree after all insertions and perform deletions step by step.

---

### **Initial AVL Tree (After Insertions)**
```
        15
       /  \
      10   20
     /  \   / \
    8    12 17 25
```

---

### **Deletion Steps**

#### **1. Delete 10**
- **Step 1:** Locate node **10**.
- **Step 2:** Node **10** has two children (**8** and **12**). Replace it with its **in-order successor**, which is **12**.
- **Step 3:** Delete node **12** from its original position.
- **Step 4:** Check the balance factor of all affected nodes.

**Tree After Deleting 10:**
```
        15
       /  \
      12   20
     /     / \
    8     17 25
```

- **Balance Check:**
   - Node **15**: Left subtree height = 2, Right subtree height = 2. Balance factor = 0 (balanced).
   - Node **12**: Left subtree height = 1, Right subtree height = 0. Balance factor = 1 (balanced).
   - Node **20**: Left subtree height = 1, Right subtree height = 1. Balance factor = 0 (balanced).
- The tree remains balanced. No rotations are needed.

---

#### **2. Delete 20**
- **Step 1:** Locate node **20**.
- **Step 2:** Node **20** has two children (**17** and **25**). Replace it with its **in-order successor**, which is **17**.
- **Step 3:** Delete node **17** from its original position.
- **Step 4:** Check the balance factor of all affected nodes.

**Tree After Deleting 20:**
```
        15
       /  \
      12   17
     /       \
    8        25
```

- **Balance Check:**
   - Node **15**: Left subtree height = 2, Right subtree height = 2. Balance factor = 0 (balanced).
   - Node **12**: Left subtree height = 1, Right subtree height = 0. Balance factor = 1 (balanced).
   - Node **17**: Left subtree height = 0, Right subtree height = 1. Balance factor = -1 (balanced).
- The tree remains balanced. No rotations are needed.

---

### **Final AVL Tree After Deletions**
```
        15
       /  \
      12   17
     /       \
    8        25
```


---

### **Search Operation for 12**

#### **Steps:**
1. Start at the **root node (15)**.
  - Compare **12** with **15**.
  - Since **12 < 15**, move to the **left child** of **15** (node **12**).
2. Check node **12**.
  - Compare **12** with **12**.
  - The element is found.

#### **Nodes Checked:**
```
15 → 12
```

---

### **Visual Representation of Search Path**

```
        15
       /  \
      12   17
     /       \
    8        25
```

- **Nodes Checked:** Highlight **15** and **12**.
- **Search Path:** `15 → 12`.




