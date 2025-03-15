// TreeNode.java
public class TreeNode {
int value;
TreeNode left, right;

public TreeNode(int value){
    this.value = value;
    this.left = null;
    this.right = null;
}
}

class BinarySearchTree{
  private  TreeNode root;

  public BinarySearchTree(){
      this.root = null;
  }

  public void insert(int value){
      root = insertRec(root, value);
  }

  public TreeNode insertRec(TreeNode root , int value){
      if(root == null){
          root = new TreeNode(value);
          return root;
      }
      if(value < root.value){
          root.left = insertRec(root.left, value);
      } else if(value > root.value){
          root.right = insertRec(root.right, value);
      }
      return root;
  }

  public boolean search(int value){
      return searchRec(root, value);
  }

  public boolean searchRec(TreeNode root, int value){
      if(root == null) {
          return false;
      }
      if(value == root.value) {
          return true;
      }else if(value < root.value){
          return searchRec(root.left, value);
      } else{
          return searchRec(root.right, value);
      }
  }

  public void delete(int value){
      root = deleteRec(root, value);
  }

  public TreeNode deleteRec(TreeNode root, int value){
      if(root == null){
          return root;
      }
      if(value < root.value){
          root.left = deleteRec(root.left, value);
      } else if(value > root.value){
          root.right = deleteRec(root.right, value);
      } else{
          if(root.left == null){
              return root.right;
          } else if(root.right == null){
              return root.left;
          }
          root.value = minValue(root.right);
          root.right = deleteRec(root.right, root.value);
      }
      return root;
  }

  public int minValue(TreeNode root){
      int minValue = root.value;
      while(root.left != null){
          minValue = root.left.value;
          root = root.left;
      }
      return minValue;
  }

  public void inorder(){
      inorderRec(root);
  }

  public void inorderRec(TreeNode root){
      if(root != null){
          inorderRec(root.left);
          System.out.print(root.value + " ");
          inorderRec(root.right);
      }
  }
}


