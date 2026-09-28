import org.example.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {

    private Triangulo triangulo;

    @Before
    public void setUp(){
        triangulo = new Triangulo();
    }

    @Test
    public void trianguloValido(){
        String resultado = triangulo.calcularTriangulo(2,2,2);

        Assert.assertEquals("Equilátero", resultado);
    }

}
