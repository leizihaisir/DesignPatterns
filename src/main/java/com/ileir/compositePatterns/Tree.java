package com.ileir.compositePatterns;

/**
 * 组合模式将多个对象组合在一起进行操作，常用于表示树形结构中
 * <p>
 * Created by zihailei on 2017/10/8.
 */
public class Tree {

    TreeNode root = null;

    // 构造方法
    public Tree(String name) {
        root = new TreeNode(name);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode treeNodeB = new TreeNode("B");
        TreeNode treeNodeC = new TreeNode("C");

        treeNodeB.add(treeNodeC);
        tree.root.add(treeNodeB);
        System.out.println("build the tree finished!");
        System.out.println(tree.toString());

    }
}
