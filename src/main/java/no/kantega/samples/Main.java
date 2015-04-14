package no.kantega.samples;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "My version is: " + Main.class.getPackage().getImplementationVersion());
    }
}
