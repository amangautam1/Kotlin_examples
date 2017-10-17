package Data_Structure

/**
 * Created by Aman gautam on 10-OCT-17.
 */
class Tree(var value: Int, var left: Tree? = null, var right: Tree? = null, var parent: Tree? = null)//data class

class TreeHelper {  // class to perform basic operations of a tree
    var root: Tree? = null

    init {
        root = null
    }

    fun insert(value: Int) {
        var y: Tree? = null
        var x: Tree? = root
        var ptr = Tree(value)
        while (x != null) {
            y = x
            x = if (ptr.value < x.value)
                x.left
            else
                x.right
        }
        ptr.parent = y
        when {
            y == null -> root = ptr
            ptr.value < y.value -> y.left = ptr
            else -> y.right = ptr
        }
        println("inserted")
        inOrder(root)
    }

    fun minValue(root: Tree): Int {
        var root: Tree = root
        var minv = root.value
        while (root.left != null) {
            minv = root.left!!.value
            root = root.left!!
        }
        return minv
    }


    fun deleteRec(root: Tree?, key: Int): Tree? {
        /* Base Case: If the tree is empty */
        if (root == null) return root

        /* Otherwise, recur down the tree */
        if (key < root.value)
            root.left = deleteRec(root.left, key)
        else if (key > root.value)
            root.right = deleteRec(root.right, key)
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right
            else if (root.right == null)
                return root.left

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.value = minValue(root.right!!)

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value)
        }// if key is same as root's key, then This is the node
        // to be deleted

        return root
    }

    fun inOrder(x: Tree? = null) {
        if (x != null) {
            inOrder(x.left)
            print("${x.value} ,")
            inOrder(x.right)
        }

    }

    fun preOrder(x: Tree? = null) {
        if (x != null) {
            print("${x.value} ,")
            //  println(x.value)
            preOrder(x.left)
            preOrder(x.right)
        }

    }

    fun postOrder(x: Tree? = null) {
        if (x != null) {
            preOrder(x.left)
            preOrder(x.right)
            print("${x.value} ,")
        }
    }

}

fun main(arg: Array<String>) {
    var th = TreeHelper();
    while (true) {
        println("\n Enter 1 to insert\n 2 to delete \n 3 to inorder \n 4 to preorder \n 5 postorder ");
        var ch = readLine()!!.toInt()
        when (ch) {
            1 -> {
                var value = readLine()!!.toInt()
                th.insert(value)
            }
            2 -> {
                print("enter value :")
                var value = readLine()!!.toInt()
                th.deleteRec(th.root, value)
            }
            3 -> th.inOrder(th.root)
            4 -> th.preOrder(th.root)
            5 -> th.postOrder(th.root)

        }
    }
}