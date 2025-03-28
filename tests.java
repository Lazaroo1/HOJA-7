import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tests {
    
    @Test
    public void testInsertarYBuscar() {
        BinaryTree<String, Integer> arbol = new BinaryTree<>();
        arbol.insertar("b", 2);  
        arbol.insertar("a", 1);
        
        assertEquals(1, arbol.buscar("a"));  
    }


        @Test
    public void testRecorridoInOrder() {
        BinaryTree<String, Integer> arbol = new BinaryTree<>();
        arbol.insertar("c", 3);
        arbol.insertar("a", 1);
        
        List<Integer> resultado = arbol.inOrder();
        assertEquals(List.of(1, 3), resultado);
    }

    @Test
public void testBuscarPorNombreCaseInsensitive() {
    SistemaInventario sistema = new SistemaInventario();
    sistema.agregarProducto(new Producto("301", "Gorra", "Clásica"));
    
    assertNotNull(sistema.buscarPorNombre("GORRA"));  


    
}


@Test
public void testAgregarYBuscarProducto() {
    SistemaInventario sistema = new SistemaInventario();
    Producto p = new Producto("201", "Zapatos", "Running");
    sistema.agregarProducto(p);

    assertEquals(p, sistema.buscarPorSKU("201"));
    assertEquals(p, sistema.buscarPorNombre("zapatos")); 
}

@Test
public void testBuscarClaveInexistente() {
    BinaryTree<String, Integer> arbol = new BinaryTree<>();
    arbol.insertar("a", 1);
    
    assertNull(arbol.buscar("z"));  
}

}
