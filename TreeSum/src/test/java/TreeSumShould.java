import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeSumShould {
    @Test
    public void returnNumberIfOnlyRoot() {
        TreeNode tree = new TreeNode(6);
        Assertions.assertEquals(6, Kata.add(tree));
    }

    @Test
    public void return0IfNoValue() {
        Assertions.assertEquals(0, Kata.add(null));
    }

    @Test
    public void returnSumOfLeftBranch() {
        TreeNode tree = new TreeNode(new TreeNode(2), new TreeNode(1), 6);
        Assertions.assertEquals(8, Kata.add(tree));
    }

    @Test
    public void returnSumOfLeftDifBranch() {
        TreeNode tree = new TreeNode(new TreeNode(1), new TreeNode(2), 6);
        Assertions.assertEquals(8, Kata.add(tree));
    }

    @Test
    public void returnSumOf2LeftBranch() {
        TreeNode tree = new TreeNode(new TreeNode(new TreeNode(2), new TreeNode(1), 2), new TreeNode(1), 6);
        Assertions.assertEquals(10, Kata.add(tree));
    }

    @Test
    public void returnSumOf2LeftDiffBranch() {
        TreeNode tree = new TreeNode(new TreeNode(new TreeNode(1), new TreeNode(2), 2), new TreeNode(1), 6);
        Assertions.assertEquals(10, Kata.add(tree));
    }

    @Test
    public void returnSumOfRightBranch() {
        TreeNode tree = new TreeNode(new TreeNode(2), new TreeNode(3), 6);
        Assertions.assertEquals(9, Kata.add(tree));
    }

    @Test
    public void returnSumOf2RightBranch() {
        TreeNode tree = new TreeNode(new TreeNode(200), new TreeNode(new TreeNode(new TreeNode(9999), new TreeNode(1),-1000), new TreeNode(1), 300), 6);
        Assertions.assertEquals(6+300-1000+9999, Kata.add(tree));
    }


}
