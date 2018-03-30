package main.java.Structural.Adapter;

public class Client {

    private StringBuilder log;
    private OldSuperLibrary library;

    public Client(StringBuilder log) {
        this.log = log;
    }

    {
        library = new SuperLibrary();
    }

    /**
     * Instead of changing all methods names(which could be thousands in big project)
     * e.g. from getLibraryName() to getName()
     * we just create Adapter == SuperLibrary that
     * overrides all methods from old Library and calls corresponding methods from new Library
     *
     */
    public void doFancyThingsWithSuperLibrary(){

        String name = library.getLibraryName();
        log.append(name);
        log.append("\n");
    }
}
