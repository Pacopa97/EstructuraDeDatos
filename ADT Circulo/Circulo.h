#pragma once
#include "Figura.h"

class Circulo:
	public Figura
	
{
public:
	Circulo();
	Circulo(double,double,double);
	Circulo(double,Figura);
	Circulo(double);
	double getRadio();
	void setRadio(double);

protected:
	double radio;
};

