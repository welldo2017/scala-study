package com.welldo.scalaStudy.chapter7.extends6

/** Scala中类型检查和转换
  * @author welldo
  *         2019/12/4
  */
object TypeConvert5 {
  def main(args: Array[String]): Unit = {
    val person = new Person4
    val emp = new Emp4
    val worker = new Worker4

    test(person)
    test(emp)//向上转型
    test(worker)//向上转型
  }

  def test(p:Person4): Unit = {
    if (p.isInstanceOf[Emp4]) {
      p.asInstanceOf[Emp4].sayEmp() //向下转型
    } else if (p.isInstanceOf[Worker4]) {
      p.asInstanceOf[Worker4].sayWorker()  //向下转型
    } else {
      p.printName()
    }
  }

}

//父类,有两个子类
class Person4 {
  var name = "welldo"
  def printName(): Unit = {
    println(this.name + " person..")
  }
}
class Emp4 extends Person4 {
  def sayEmp(): Unit = {
    println(this.name + " sayEmp")
  }
}
class Worker4 extends Person4 {
  def sayWorker(): Unit = {
    println(this.name + " sayWorker")
  }
}