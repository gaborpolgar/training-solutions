package stringbuilder;

public enum Title {

    MR("Mr."), MS("Ms."), MISS("Miss."), MRS("Mrs."), DR("Dr."), PROF("Prof.");

    Title(String titleStr) {
        this.titleStr = titleStr;
    }

    private String titleStr;

    public String getTitleStr(){
        return titleStr;
    }
}
