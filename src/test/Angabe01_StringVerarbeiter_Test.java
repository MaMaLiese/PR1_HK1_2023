package test;
import src.Angabe01.StringVerarbeiter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Angabe01_StringVerarbeiter_Test {
    @Test
    public void testliefereLaenge(){
        //Testen der ersten Methode - da Static - keine Instanzierung notwendig
        assertEquals(5, StringVerarbeiter.liefereLaenge("hallo"));
    }
    @Test
    public void testLiefereZeichen(){
        assertEquals('l',StringVerarbeiter.liefereZeichen("hallo", 2));
    }
    @Test
    public void testErsetzeAlles(){
        assertEquals("haxxo",StringVerarbeiter.ersetzeAlle("hallo", 'l', 'x'));
    }
    @Test
    public void testEquals(){
        assertEquals(true, StringVerarbeiter.stringVergleicher("Max","Max"));
        assertEquals(false, StringVerarbeiter.stringVergleicher("Max","Nix"));
    }
}
