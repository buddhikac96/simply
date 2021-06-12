package test;

import app.Driver;

import java.io.File;
import java.security.Permission;

public class Test {
    public static void main(String[] args) throws Exception {

        SecurityManager securityManager = new SecurityManager() {
            public void checkPermission(Permission permission) {
                if ("exitVM".equals(permission.getName())) {
                    throw new SecurityException("System.exit attempted and blocked.");
                }
            }
        };

        System.setSecurityManager(securityManager);



        File file = new File("src/test/ErrorTest");
        var folderList = file.listFiles();

        System.out.println(folderList.length);

        for(var folder : folderList){
            var testFileList = folder.listFiles();
            System.out.println(testFileList.length);
            for (var testFile: testFileList){
                System.out.println("================ Test ================");
                System.out.println(testFile.getName());
                var arr = new String[]{testFile.getAbsolutePath(), "src/main/resources/UniversalJavaLibraryResourceModel.json"};

                try{
                    Driver.main(arr);
                }catch (Throwable e){
                    e.printStackTrace();
                }
            }
        }
    }
}
