import java.{util => ju}

//////---------------------Array --------------------------////
def collect() = {
    val tab1 = Array(1,3,6,"bonjour")
    tab1.length // pour la taille 
    tab1.apply(2) // = tab1(2)
    tab1.update(0, "ben") // modification 
    tab1(1)= "Tamou" //
    tab1.mkString(",")

    }

//print(collect())

///////////------------------- List ---------------------////
val liste1 = List(1,2,"bonnjour")
//print(liste1)

def collect_list()= {
    val liste1 :List[Int] = List(1,2,4,5,6,10,19,20)  
    val liste2 = List(3,7,8,10)
    val liste3 = 12 :: liste2
    val liste4 = liste3 :+4
    val a = liste1.drop(2) // drop(nombre de valeur a retirer de la liste en commencant au debut)
    
    // garder sous forme d'une condition 
    val b = liste1.filter(_%2 ==0)

    // reduce (reduire une valeure )
    val c = liste1.reduce(_*_)

    // modifier la liste 
    val d = liste1.map(_*3)

    print(d)
}

//collect_list()



/////////////-------------- Set ----------------------------////////////

def setCollect() = {
    val a = Set(1,2,2,2,1,3,6,7,1,4,3)
}

//setCollect()

////------------------ Map ----------------------//////////

def mapCollect() = {
    val a = Map("a"->1, "b"->2)
    print(a)
}

// mapCollect()


/////: ---- vecteur -------------------------/////

def vectCollect = {
    val vec = Vector(1,2,3,4)
    val vec2 = vec:+ 6
    print(vec2)
}

vectCollect

