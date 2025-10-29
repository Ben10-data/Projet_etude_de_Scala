error id: file://<WORKSPACE>/demo1/src/main/scala/Student.scala:scala/Unit#
file://<WORKSPACE>/demo1/src/main/scala/Student.scala
empty definition using pc, found symbol in pc: scala/Unit#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Unit#
	 -scala/Predef.Unit#
offset: 307
uri: file://<WORKSPACE>/demo1/src/main/scala/Student.scala
text:
```scala
import scala.io.StdIn.readLine

class Student(var name: String, var roll: String)
{
    var sems = 1;

    def changeSems(): Unit = {
          sems = sems + 1;

    }

    def printData(): Unit = {
      println(name);
      println(roll);
      println(sems);

    }

}




object Main {

  def main(): Un@@it = 
  {
     var s1 = new Student("John","123");
     var s2 = new Student("Alica","124");
     s1.sems = 3;

     s1.printData();
     println("---------");
     s2.printData();

     println(checkSems(s1,s2));




  }


  def checkSems(s1: Student, s2: Student): String =
  {
        if(s1.sems > s2.sems)
        {
          return s1.name;
        }
        else
        {
          return s2.name;
        }
  }
  

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Unit#