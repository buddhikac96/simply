package universalJavaMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class JavaLibraryProvider {
    private final HashSet<String> set;
    private final List<JavaLibrary> libraryList;

    public JavaLibraryProvider() throws IOException {
        this.set = new HashSet<>();

        ObjectMapper objectMapper = new ObjectMapper();
        libraryList = objectMapper.readValue(
                new File("src/main/resources/UniversalJavaLibraryResourceModel.json"),
                new TypeReference<List<JavaLibrary>>(){}
        );

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


    ////////////////////////////////////////////////////////////////
    ////////////////////// JLP Service /////////////////////////////
    ////////////////////////////////////////////////////////////////

    public HashSet<String> getSet() {
        return set;
    }

    public void addLibFunctionHash(String hash){
        this.set.add(hash);
    }

    public boolean isExist(String hash){
        return set.contains(hash);
    }

    public String getLibrary(String hash){
        return hash.split(";")[0].split(":")[1];
    }

    public String getFunction(String hash){
        return hash.split(";")[1].split(":")[1];
    }

    public String getReturnType(String hash){
        return hash.split(";")[2].split(":")[1];
    }

    public List<String> getParams(String hash){
        return Arrays.asList(hash.split(";")[3].split(":")[1].split(","));
    }

}


