package com.hektorKS.Structural.Adapter;

public class SuperLibrary implements OldSuperLibrary {
    @Override
    public String getLibraryName() {
        NewSuperLibrary library = new NewSuperLibrary();
        return library.getName();
    }
}
