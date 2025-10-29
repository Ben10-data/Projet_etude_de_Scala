/// Exo 1 ----- Fonction lambda------//

    ///Créer une fonction anonyme qui multiplie un nombre par 3 et 
        //l’assigner à une variable triple.

val triple = (x : Int) => x * 3 

println(triple(5))

//// Exo2 

def factoriel(n : Int) : Int = {
    if (n == 0) 1 
    else {
        n *  factoriel(n -1)
    }

}
println(factoriel(2))

var a : Int = 12 
val b = 12

a += b

print(a)
