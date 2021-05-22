package universalJavaMapper;

import java.util.HashSet;
import java.util.List;

public class JavaLibraryProvider {
    HashSet<String> set;
    public List<JavaLibrary> libraryList;

    public JavaLibraryProvider(List<JavaLibrary> libraryList) {
        this.libraryList = libraryList;
        this.set = new HashSet<>();
        createHashSet();
    }

    private HashSet<String> createHashSet(){
        for(var lib : libraryList){
            var libSb = new StringBuilder();
            libSb.append("lib:").append(lib.name).append(";");
            for(var func : lib.functions){
                var funcSb = new StringBuilder(libSb);
                funcSb.append("func:").append(func.name).append(";");
                for(var ovld : func.overloads){
                    var oSb = new StringBuilder(funcSb);
                    oSb.append("return:").append(ovld.returnType).append(";");
                    if(!ovld.params.isEmpty()){
                        oSb.append("params:");
                        for(var param : ovld.params){
                            oSb.append(param).append(",");
                        }
                    }
                    this.set.add(oSb.toString());
                }
            }
        }

        return set;
    }
}
