import app.bootstrap.LibResourceModal;
import org.dom4j.DocumentException;
import org.junit.Test;

public class LibResourceMapperTest {
    LibResourceModal libResourceModal;

    public LibResourceMapperTest() throws DocumentException {
        //this.libResourceModal = LibResourceModalMapper.getMap();
    }

    @Test
    public void libraryCountTest() {
        assert libResourceModal.libraries.size() == 2;
    }

    /*@Test
    public void libName() {
        assert libResourceModal.libraryList.get(0).jname.equals("libjname");
    }*/
}
