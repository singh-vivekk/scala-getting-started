import func.OtherClass

object HelloWorld {
  def main(args:Array[String])
  {
    println("Welcome to https://www.interviewbit.com/scala-interview-questions/")
  }

  //  how to create a class object in Scala
  //  Calling a class from the same package without arguments
  var obj=new Hello()
  obj.main()

  //  TestClass object
  //  Calling class from the same package with arguments
  var objTC=new TestClass()
  objTC.sum(10,20)

  //  Object creation from other packages class and by passing arguments
  var otherObj=new OtherClass()
  otherObj.subtract(50,20)
}
