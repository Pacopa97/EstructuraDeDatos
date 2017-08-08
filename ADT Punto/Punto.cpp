#include "Punto.h"

Punto :: Punto (int coordX, int coordY, int coordZ)
{
	this->coordX = coordX;
	this->coordY = coordY;
	this->coordZ = coordZ;
	this->dim = "Tiene 3 dimensiones";
}

Punto :: Punto(int coordX, int coordY)
{
	this->coordX = coordX;
	this->coordY = coordY;
	this->coordZ = NULL;
	this->dim = "Tiene 2 dimensiones";
}

Punto :: Punto()
{
	this->coordX = NULL;
	this->coordY = NULL;
	this->coordZ = NULL;
	this->dim = "No tiene dimensiones";
}

int Punto::getX()
{
	return this->coordX;
}
int Punto::getY()
{
	return this->coordY;
}
int Punto::getZ()
{
	return this->coordZ;
}
std::string Punto::getdim()
{
	return this->dim;
}

void Punto::setX(int coordX)
{
	this->coordX = coordX;
}
void Punto::setY(int coordY)
{
	this->coordY = coordY;
}
void Punto::setZ(int coordZ)
{
	this->coordZ = coordZ;
}
void Punto::setdim(std::string dim)
{
	this->dim = dim;
}
