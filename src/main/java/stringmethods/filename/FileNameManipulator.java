package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if (str.isEmpty() || str.trim() == ""){
            throw  new IllegalArgumentException();
        }
        // Character.toString(str.lastIndexOf());
        return str.trim().charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        if (fileName.isEmpty() || fileName.trim() == "" || isEmpty(fileName)){
            throw  new IllegalArgumentException();
        }
        ;
        fileName.lastIndexOf('.');
        String[] file = fileName.split(".");
        // fileName.trim().substring(fileName.lastIndexOf('.');
        // fileName.endsWith(ext);
        return file[1].trim();
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        // String [] file = fileName.split(".");
        if(!fileName.contains(".") || ext == "" || ext.isEmpty() || fileName.trim() == "" || fileName.isEmpty()){
            throw new IllegalArgumentException();
        }
        // file[1].trim().equals(ext);
        return fileName.contains(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName) {
        String[] file = fileName.split(".");
        return file[1].trim().toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            fileName.replaceAll(present, target);
        }
        return fileName;
    }

    private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());
    }
}

