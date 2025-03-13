public class Kata {

    //Not solved by me

    static int add(TreeNode root) {
        if (root == null) return 0;

        int leftSide = root.getLeft() != null ? add(root.getLeft()) : add(root.getRight());
        int rightSide = root.getRight() != null ? add(root.getRight()) : add(root.getLeft());

        return Math.max(leftSide, rightSide) + root.getValue();
    }
}
