package com.hektorKS.Creational.AbstractFactory;

/**
 * Abstract factory design pattern provides an interface for creating families of related or dependent
 * objects without specifying their concrete class.
 *
 * Usage:
 * When your system has to create multiple families of products or you want to provide
 * a library of products without exposing the implementation details.
 *
 * Implementation seems to be little bit tangled, but what are benefits from this design pattern?
 *
 * The client code has no knowledge whatsoever of the concrete type, not needing to include any header files
 * or class declarations related to it. The client code deals only with the abstract type.
 * Objects of a concrete type are indeed created by the factory, but the client code accesses such objects only
 * through their abstract interface.
 *
 * A real life example for the use of the Abstract Factory pattern is providing data access to two different data
 * sources (e.g. a SQL Database and a XML file). You have two different data access classes
 * (a gateway to the datastore). Both inherit from a base class that defines the common methods to be implemented
 * (e.g. Load, Save, Delete).
 *
 * Which data source shall be used shouldn't change the way client code retrieves it's data access class.
 * Your Abstract Factory knows which data source shall be used and returns an appropriate instance on request.
 * The factory returns this instance as the base class type.
 *
 */
public interface PlantFactory {
    Plant makePlant();
    Picker makePicker();
}
