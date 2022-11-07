package dataStructure.Trees;

public class binaryTree {
    node Root;
    class node{
        node left;
        node right;
        public int data;
        public node(int data)
        {
            this.data = data;
            this.left=null;
            this.right=null;
        }

        @Override
        public String toString() {
            return data+" ";
        }
    }
    public void insert(int valve)
    {
       node newNode = new node(valve);
       if (Root==null)
       {
           Root = newNode;
       }
       else {
           node focusNode = Root;
           node parent;
           while (true)
           {
               parent = focusNode;
               if (valve <focusNode.data)
               {
                  focusNode  = focusNode.left;
                  if (focusNode==null)
                  {
                      parent.left=newNode;
                      return;
                  }
               }
               else {
                   focusNode=focusNode.right;
                   if (focusNode==null)
                   {
                       parent.right= newNode;
                       return;
                   }
               }
           }
       }
    }
    public void inOrderTraverseTree(node focusNode)
    {
        if (focusNode!=null)
        {
            inOrderTraverseTree(focusNode.left);
            System.out.print(focusNode.data+" ");
            inOrderTraverseTree(focusNode.right);


        }
    }
    public void PostOrderTraverseTree(node focusNode)
    {
        if (focusNode!=null)
        {
            PostOrderTraverseTree(focusNode.left);
            PostOrderTraverseTree(focusNode.right);
            System.out.print(focusNode+"|");

        }
    }
    public void PreOrderTraverseTree(node focusNode)
    {
        if (focusNode!=null)
        {
            System.out.println(focusNode);
            PreOrderTraverseTree(focusNode.left);
            PreOrderTraverseTree(focusNode.right);


        }
    }


    public static void main(String[] args) {
       binaryTree tree = new binaryTree();
       tree.insert(15);
        tree.insert(20);
        tree.insert(18);
        tree.insert(12);
        tree.insert(25);
        tree.insert(10);
        tree.insert(14);
       tree.inOrderTraverseTree(tree.Root);
       tree.PreOrderTraverseTree(tree.Root);
       tree.PostOrderTraverseTree(tree.Root);


    }

}
