# Leftist Tree Operations

This document outlines the drawing operations for Leftist Trees, including insertion, deletion, and merging. The leftist tree is a type of binary tree used for efficient merge operations. It maintains a leftist property where the left child has a shorter or equal rank compared to the right child.

## 1. Insertion
### Insert Elements: `15, 10, 20, 8, 12, 17, 25`

#### Initial Tree (empty):
```
(empty)
```

#### Insert 15:
After insertion:
```
  15
```

#### Insert 10:
After insertion:
```
  15
 /
10
```

#### Insert 20:
After insertion:
```
  15
 /  \
10   20
```

#### Insert 8:
After insertion:
```
   15
  /  \
 10   20
 /
8
```

**Maintain Leftist Property:**  
Perform a right rotation, moving 10 to the right of 8, leading to:
```
    15
   /  \
  8   20
 / \
10
```

#### Insert 12:
After insertion:
```
    15
   /  \
  8   20
 / \
10  12
```

#### Insert 17:
After insertion:
```
    15
   /  \
  8   20
 / \  /
10  12 17
```

#### Insert 25:
After insertion:
```
    15
   /  \
  8   20
 / \  / \
10 12 17 25
```

---

## 2. Deletion
### Delete the Minimum Element Three Times

#### Initial Tree (after all insertions):
```
    15
   /  \
  8   20
 / \  / \
10 12 17 25
```

#### Delete Minimum (8):
- The minimum element (8) is deleted.  
- Tree after removal:
```
    15
   /  \
 10   20
 / \  / \
12  17   25
```

**Maintain Leftist Property:**  
Swap 10 and 12 to maintain the leftist property:
```
    15
   /  \
 12   20
 / \  / \
10 17 25
```

#### Delete Minimum (10):
- The minimum element (10) is deleted.  
- Tree after removal:
```
    15
   /  \
 12   20
   \  / \
  17 25
```

**Maintain Leftist Property:**  
No swaps are needed here, as the leftist property is already satisfied.

#### Delete Minimum (12):
- The minimum element (12) is deleted.  
- Tree after removal:
```
    15
   /  \
 17    20
   \   / \
   25
```

---

## 3. Merging
### Merge Tree 1 and Tree 2

#### Tree 1:
```
  15
 /  \
10   20
```

#### Tree 2:
```
   8
  / \
12  17
    /
   25
```

### Step 1: Merge Tree 1 and Tree 2
- Compare the root elements:
  - Since 8 < 15, we merge Tree 2 into Tree 1 by swapping the roots.

### Step 2: After Swapping
- Tree 2 becomes the root, and we merge the two trees into a new leftist tree:
```
     8
    / \
  12  15
 / \   / \
17  25    20
```



