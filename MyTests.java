import java.util.ArrayList;
import java.util.List;

public class MyTests {

    @Test
    public void getSizeOfList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        // Inicialización/escenario
        List<Integer> list = null;

        // ¿qué es lo que queremos probar?
        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());

        list.remove(1);

        // ¿qué es lo que queremos probar?
        assertEquals(3, list.size());
    }

    @Test
    public void getSizeOfClearList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test
    public void getSizeOfClearOneByOneList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(0);
        assertEquals(3, list.size());
        list.remove(1);
        assertEquals(2, list.size());
        list.remove(2);
        assertEquals(1, list.size());
        list.remove(3);

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test
    public void getSizeOfClearEmptyList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.clear();

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test
    public void AddItem() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        assertEquals(1, list.size());
        list.add(2);
        list.add(3);

        // ¿qué es lo que queremos probar?
        assertEquals(3, list.size());
    }

    @Test
    public void AddItemAfterRemove() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(1);
        list.add(3);

        // ¿qué es lo que queremos probar?
        assertEquals(2, list.size());
    }

    @Test
    public void AddItemAfterClear() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        list.add(3);

        // ¿qué es lo que queremos probar?
        assertEquals(1, list.size());
    }

    @Test
    public void CheckIfItemExist() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // ¿qué es lo que queremos probar?
        assertEquals(1, list.contains(1));
    }

    @Test
    public void GetElementById() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // ¿qué es lo que queremos probar?
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void GetElementByIdNotInList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // ¿qué es lo que queremos probar?
        assertEquals(1, list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void GetElementByIdAfterRemoving() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        list.remove(0);

        // ¿qué es lo que queremos probar?
        list.get(0);
    }

    @Test
    public void GetIdByElementNotInList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // ¿qué es lo que queremos probar?
        assertEquals(-1, list.indexOf(1));
    }


    @Test
    public void RemoveElementById() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // ¿qué es lo que queremos probar?
        assertEquals(1, list.remove(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void RemoveElementInEmptyList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.remove(0);

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

}