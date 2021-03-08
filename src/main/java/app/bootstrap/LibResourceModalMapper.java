package app.bootstrap;

import ast.util.DataTypeMapper;
import ast.util.enums.DataType;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

import static app.bootstrap.LibResourceModal.*;

public class LibResourceModalMapper {

    private LibResourceModalMapper() {
        /*
            Just Hiding the implicit public constructor
         */
    }

    private static final String libResourceXmlPath = "src/main/resources/libresources.xml";

    public static LibResourceModal getMap(){
        LibResourceModal libResourceModal = null;
        try {
            libResourceModal = parse(libResourceXmlPath);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return libResourceModal;
    }

    public static LibResourceModal parse(String path) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(path);

        List<Node> libraries = document.selectNodes("libraries/library");
        LibResourceModal libResourceModal = new LibResourceModal();

        libraries.forEach(lib -> {
            // Create library
            String libJname = lib.valueOf("jname");
            String libAlias = lib.valueOf("alias");
            List<Node> funcList = lib.selectNodes("functions/func");

            Library library = new Library(libJname, libAlias);

            // Create function
            funcList.forEach(func -> {
                String funcJname = func.valueOf("jname");
                String funcAlias = func.valueOf("alias");
                List<Node> overloadList = func.selectNodes("overloads/overload");

                Function function = new Function(funcJname, funcAlias);

                // Create overload
                overloadList.forEach(overload -> {
                    DataType returnType = DataTypeMapper.getType(overload.valueOf("return"));
                    Overload overloadItem = new Overload(returnType);

                    overload.selectNodes("args/arg").forEach(arg -> {
                        overloadItem.addArg(DataTypeMapper.getType(arg.getStringValue()));
                    });

                    // add overload to function
                    function.addOverload(overloadItem);
                });

                // add function to library
                library.addFunction(function);

            });

            // add library to lib resource modal
            libResourceModal.addLibrary(library);
        });

        return libResourceModal;
    }
}
