package stringbuilder;

public class NameBuilder {

    public static void main(String[] args) {
        NameBuilder nB = new NameBuilder();
        String name = nB.concatNameHungarianStyle("Polgár", "", "Gábor", null);
        System.out.println(name);
        name = nB.insertTitle(name, Title.DR, "Gábor");
        System.out.println(name);
    }

    public String concatNameWesternStyle (String familyName, String middleName, String givenName, Title title){
        if (isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Must be given family- and givenname");
        }
        StringBuilder sb = new StringBuilder();
        if (title != null){
            sb.append(title.getTitleStr());
        }
        sb.append(givenName).append(" ");
        if (!isEmpty(middleName)){
    sb.append(middleName);
        }
        return sb.append(" ").append(familyName).toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
        if (isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Must be given given- and familyname");
        }
        StringBuilder sb = new StringBuilder();
        if (title != null){
            sb.append(title.getTitleStr());
        }
        sb.append(familyName).append(" ");
        if (!isEmpty(middleName)){
            sb.append(middleName);
        }
        return sb.append(" ").append(givenName).toString();
    }

    public String insertTitle (String name, Title title, String where){
    return new StringBuilder(name).insert(name.indexOf(where), title.getTitleStr() + " ").toString();
    }

    public String deleteNamePart (String name, String delete){
        return new StringBuilder(name).delete(name.indexOf(delete), delete.length()+1).toString();
    }

    public boolean isEmpty (String str){
        return str == null || str.trim().equals("");
    }
}
