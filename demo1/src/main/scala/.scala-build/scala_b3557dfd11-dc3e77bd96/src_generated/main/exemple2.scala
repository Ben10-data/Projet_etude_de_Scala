

object exemple2 extends App {
val scriptPath = """exemple2.sc"""
/*<script>*/

//> using scala 2.12
//> using dep org.apache.spark:spark-sql_2.12:3.5.1

import org.apache.spark.sql.SparkSession

// Créer une SparkSession
val spark = SparkSession.builder
  .appName("ExempleScalaSpark")
  .master("local[*]")
  .getOrCreate()

// Charger un fichier texte
val data = spark.read.textFile("data.txt")

// Compter le nombre de lignes contenant "Scala"
val count = data.filter(line => line.contains("Scala")).count()

println(s"Nombre de lignes avec 'Scala' : $count")

// Arrêter Spark
spark.stop()

/*</script>*/ /*<generated>*/
/*</generated>*/
}
