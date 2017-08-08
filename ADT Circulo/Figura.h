#pragma once

class Figura

{
public:
	Figura();
	Figura(double, double);
	double getArea();
	double getPerimetro();
	void setArea(double);
	void setPerimetro(double);
	
protected:
	double area;
	double perimetro;
};