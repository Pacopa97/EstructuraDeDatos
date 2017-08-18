//  Write some awesome Swift code, or import libraries like "Foundation",
//  "Dispatch", or "Glibc"
print("Hello world!")

import Foundation

class FetchClass {
	
    var vector: [Int] = []
	
    func fetch(n: Int)->Int{
        preconditionFailure("This method must be overridden")
    }
    func setVector(v: [Int]){
        self.vector = v
    }
    func randomVector(n:Int)->[Int]{ //Llena el vector con numeros random
        var v:[Int] = [Int]()
        for _ in 0...(n-1) {
            v.append(random() % 100)
        }
        return v
    }
    func getVector()->[Int]{ //Getter
        return self.vector
    }
    func showVector(){ //Muestra el vector con formato de corchetes [,]
        let count:Int = self.vector.count-1
        var string = "["
        for(index) in 0...count{
            string+=String(self.vector[index])
            string+=","
        }
        string = String(string.characters.dropLast()) + "]"
        print(string)
    }
	
	
    func showFetch(n: Int){ //Muestra la posiciion del numero buscado y regresa un mensaje en caso de no encontarlo
		
        if(n==(-1)){print("El numero no se encuentra en el vector")}
        else
        {print("El numero se encuentra en la posición \(n)")}
    }
}

protocol Ordenamientos{
	
        func seleccion()
    }


class binario: FetchClass, Ordenamientos{
	   func seleccion() {
		
            var menor = 0
            var aux = 0
		   
            for index in 0...vector.count-1{
                menor=index
                for index2 in stride(from: index+1, to: vector.count-1, by: 1){
                    if(vector[index2]<vector[index]){
                        menor=index2
                    }
                }
                    aux = vector[index]
                    vector[index] = vector[menor]
                    vector[menor] = aux
            }
        }

	
    override func fetch (n: Int) -> Int {
        var center: Int = 0
        var start: Int = 0
        var last: Int = self.vector.count-1
        
        while(start<=last) { //Ciclo while para encontar el centro del arreglo 
            center = (start+last)/2
            
            if(self.vector[center]==n ){ //Se regresa el valor del centro
				return center
			}
            
            if(n < self.vector[center]){ //Si el valor del numero es menor al del centro se recorrer el pivote final a la posicion centro-1
                last = center-1
            } else {  //Si el valor del numero es mayor al del centro se recorre el pivote inicial a centro+1
                start = center+1
            }
        }
        return -1
    }
}

class secuencial: FetchClass{
    override func fetch(n: Int) -> Int {
        let count:Int = self.vector.count-1
        for i in 0...count{
            if(self.vector[i]==n){return i}
        }
        return -1
    }
}

//Vector para probar binario
//var vector: [Int] = [0,1,2,3,4,5]
var main: secuencial = secuencial()
main.setVector(v: main.randomVector(n: 10))
main.showVector()
main.showFetch(n: main.fetch(n: 20))

var main2: binario = binario()
main2.setVector(v: main.randomVector(n:10))
main2.seleccion()
main2.showVector()
main2.showFetch(n: main2.fetch(n: 4))
