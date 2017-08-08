#pragma once
#include <string>


class Punto
{
public:
	Punto();
	Punto(int,int,int);
	Punto(int, int);
	int getX();
	int getY();
	int getZ();
	std::string getdim();
	void setX(int);
	void setY(int);
	void setZ(int);
	void setdim(std::string);

private:
	int coordX;
	int coordY;
	int coordZ;
	std::string dim;
};

