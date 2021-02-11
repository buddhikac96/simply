package app.bootstrap;

import ast.error.LibResourceModal;
import ast.util.DataTypeMapper;
import ast.util.enums.DataType;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

import static ast.error.LibResourceModal.Function;
import static ast.error.LibResourceModal.Library;
import static ast.error.LibResourceModal.Overload;

public class LibResourceModalMapper {

    public static LibResourceModal map(String path) throws DocumentException {
        LibResourceModal libResourceModal = parse(path);

        return libResourceModal;
    }

    public static LibResourceModal parse(String path) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(path);

        List<Node> libraries = document.selectNodes("//library");

        LibResourceModal libResourceModal = new LibResourceModal();

        libraries.forEach(lib -> {
            // Create library
            String libJname = lib.valueOf("jname");
            String libAlias = lib.valueOf("alias");
            List<Node> funcList = lib.selectNodes("//func");

            Library library = new Library(libJname, libAlias);

            // Create function
            funcList.forEach(func -> {
                String funcJname = func.valueOf("jname");
                String funcAlias = func.valueOf("alias");
                List<Node> overloadList = func.selectNodes("//overloads");

                Function function = new Function(funcJname, funcAlias);

                // Create overload
                overloadList.forEach(overload -> {
                    DataType returnType = DataTypeMapper.getType(overload.valueOf("return"));
                    Overload overloadItem = new Overload(returnType);

                    overload.selectNodes("//args/arg").forEach(arg -> {
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
