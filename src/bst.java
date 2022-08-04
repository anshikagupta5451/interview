//class Emp{
//        String name;
//        int sal;
//        int eid;
//        Emp(String name , int sal, int eid){
//        this.name = name;
//        this.sal = sal;
//        this.eid = eid;
//        }
//        }
//class Node{
//    Emp data;
//    Node left, right;
//
//    public Node(Emp data) {
//        this.data = data;
//    }
//}
//public class bst {
//    static class B_TREE{
//        public static Node Build(Node root, Node val){
//            if(root == null) return val;
//            else{
//                if(root.data.name.compareToIgnoreCase(val.data.name) > 0){
//                    root.left = Build(root.left, val);
//                }
//                if(root.data.name.compareToIgnoreCase(val.data.name) < 0){
//                    root.right = Build(root.right, val);
//                }
//            }
//            return root;
//        }
//    }
//    public static void preorder(Node root){
//        if(root == null) return;
//        System.out.println(root.data.name + " " + root.data.sal + " " + root.data.eid);
//        preorder(root.left);
//        preorder(root.right);
//    }
////    public static boolean Des(String des, Node root){
////        if(root == null) return false;
////        else {
////            if(root.data.des.equals(des)) return true;
////            else {
////
////            }
////        }
////    }
//    public static void main(String[] args) {
//        Emp e1 = new Emp("sr", 10000, 12);
//        Emp e2 = new Emp("Naj", 20000, 14);
//        Emp e3 = new Emp("am", 30000, 65);
//        Emp e4 = new Emp("Vay", 40000, 76);
//        Emp e5 = new Emp("Jet", 50000, 90);
//        Emp e6 = new Emp("mam", 70000, 112);
//        Emp e7 = new Emp("em", 80000, 119);
//        Node root = new Node(e1);
//        root = B_TREE.Build(root, new Node(e2));
//        root = B_TREE.Build(root, new Node(e3));
//        root = B_TREE.Build(root, new Node(e4));
//        root = B_TREE.Build(root, new Node(e5));
//        root = B_TREE.Build(root, new Node(e6));
//        root = B_TREE.Build(root, new Node(e7));
//        preorder(root);
//    }
//}