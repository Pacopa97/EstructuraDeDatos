#include <iostream>
#include "Triangulo.h"
#include "Figura.h"

using namespace std;

int main()
{
	Figura prueba1 = Figura(4, 4);
	Triangulo prueba2 = Triangulo(3, 4, 7, 9, 15, 12, prueba1);
	cout << prueba2.getBase();
	cout << prueba2.getAltura();
	cout << prueba2.getHipo();
	cout << prueba2.getSen();
	cout << prueba2.getCsen();
	cout << prueba2.getTan();
	cout << prueba2.getArea();
	cout << prueba2.getPerimetro();
	cin.get();
}