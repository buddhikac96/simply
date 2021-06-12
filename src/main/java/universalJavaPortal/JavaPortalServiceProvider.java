package universalJavaPortal;

import ast.util.enums.DataType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaPortalServiceProvider implements ILibraryServiceProvider{
    private final List<SimplyFunctionModel> functionModels;

    public JavaPortalServiceProvider(String path) throws IOException {
        this.functionModels = new ArrayList<>();
        readJson(path);
    }

    // Read the universal java library model and add simply function models into the list
    private void readJson(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        var libraryList = objectMapper.readValue(
                new File(path),
                new TypeReference<List<JavaLibrary>>(){}
        );

        for(var lib : libraryList){
            for(var func : lib.functions){
                for(var overload : func.overloads){
                    var sfm = new SimplyFunctionModel();
                    sfm.setLibName(lib.name)
                            .setFuncName(func.name)
                            .setReturnType(overload.returnType);

                    for(var param : overload.params){
                        sfm.addParam(param);
                    }

                    this.functionModels.add(sfm.Build());
                }
            }
        }
    }

    // add function to model if valid and return true
    // return false if duplicate found
    public boolean addFunctionModel(SimplyFunctionModel sfm) {

        if(this.functionModels.stream().anyMatch(i -> i.equals(sfm))){
            return false;
        }
        this.functionModels.add(sfm);
        return true;
    }

    ///////////////////////////////////////////////////////
    ///////////////// Services ////////////////////////////
    ///////////////////////////////////////////////////////

    public boolean isExist(SimplyFunctionModel sfm) {
        return this.functionModels.stream().anyMatch(o -> o.equals(sfm));
    }

    public boolean isValidLibrary(String libName){
        return this.functionModels.stream().anyMatch(i -> i.getLibName().equals(libName));
    }

    //////////////////////////////////

    @Override
    public boolean isValidLibrary(Message message) {
        return false;
    }

    @Override
    public boolean isValidFuncCall(Message message) {
        return false;
    }

    @Override
    public DataType getReturnType(Message message) {
        return null;
    }

    @Override
    public boolean isFunctionExist(Message message) {
        return false;
    }

    @Override
    public String getJavaLibName(String simplyLibName) {
        return null;
    }

    @Override
    public String getFuncCall(Message message) {
        return null;
    }

}
