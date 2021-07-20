package com.welldo.study.chapter17.bst

/**
  * 自定义实现二叉树
  * BST: binary sort tree
  *
  * author welldo
  * date 2020/4/19
  */
object MyBST {
  def main(args: Array[String]): Unit = {
    //先使用比较简单方法，直接关联的方法
    val root = new HeroNode(1, "宋江")
    val hero2 = new HeroNode(2, "吴用")
    val hero3 = new HeroNode(3, "卢俊义")
    val hero4 = new HeroNode(4, "林冲")
    val hero5 = new HeroNode(5, "关胜")

    root.left = hero2
    root.right = hero3

    hero3.left = hero5
    hero3.right = hero4

    val binaryTree = new BinaryTree
    binaryTree.root = root

    println("前序遍历")
    binaryTree.preOrder()

    println("中序遍历")
    binaryTree.infixOrder()

    println("后序遍历")
    binaryTree.postOrder()

  }

}


//定义节点
class HeroNode(hNo: Int, hName: String) {
  val no = hNo
  var name = hName
  var left: HeroNode = null
  var right: HeroNode = null

  //后序遍历
  def postOrder(): Unit = {
    //向左递归输出左子树
    if (this.left != null) {
      this.left.postOrder()
    }
    //向右边递归输出右子树
    if (this.right != null) {
      this.right.postOrder()
    }
    //先输出当前节点值
    printf("节点信息 no=%d name=%s\n", no, name)
  }

  //中序遍历
  def infixOrder(): Unit = {
    //向左递归输出左子树
    if (this.left != null) {
      this.left.infixOrder()
    }

    //先输出当前节点值
    printf("节点信息 no=%d name=%s\n", no, name)

    //向右边递归输出右子树
    if (this.right != null) {
      this.right.infixOrder()
    }

  }

  //前序遍历
  def preOrder(): Unit = {
    //先输出当前节点值
    printf("节点信息 no=%d name=%s\n", no, name)

    //向左递归输出左子树
    if (this.left != null) {
      this.left.preOrder()
    }
    //向右边递归输出右子树
    if (this.right != null) {
      this.right.preOrder()
    }
  }
}

//需要判空
class BinaryTree {
  var root: HeroNode = null


  //后序遍历
  def postOrder(): Unit = {
    root.postOrder()
  }

  //中序遍历
  def infixOrder(): Unit = {
    root.infixOrder()
  }

  //前序遍历
  def preOrder(): Unit = {
    root.preOrder()
  }
}
