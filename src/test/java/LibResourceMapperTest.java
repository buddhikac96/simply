import app.bootstrap.LibResourceModalMapper;
import ast.error.LibResourceModal;
import org.dom4j.DocumentException;
import org.junit.Test;

public class LibResourceMapperTest {
    LibResourceModal libResourceModal;

    public LibResourceMapperTest() throws DocumentException {
        this.libResourceModal = LibResourceModalMapper.map("src/test/resources/libs.xml");
    }

    @Test
    public void libraryCountTest() {
        assert libResourceModal.libraryList.size() == 1;
    }

    @Test
    public void libName() {
        assert libResourceModal.libraryList.get(0).jname.equals("libjname");
    }
}
