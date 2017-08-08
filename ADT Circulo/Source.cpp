#include <iostream>
#include "Figura.h"
#include "Circulo.h"

using namespace std;

int main()
{
	Figura prueba1 = Figura (7, 3);
	Circulo prueba2 = Circulo (5, prueba1);
	cout << prueba2.getRadio();
	cout << prueba2.getArea();
	cout << prueba2.getPerimetro();
	cin.get();
}