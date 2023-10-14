package EX2;

public class Vers {
    private String vers;
    public Vers(String vers) {
        this.vers = vers;
    }
    public String getVers(){ return vers;}
    public int nrVocale(String s) {
    int count = 0;
    String vowels = "AEIOUaeiou";
    for(char c : s.toCharArray()){
        if(vowels.indexOf((c))!= -1)
        {
            count++;
        }
    }
    return count;
    }

    public int nrCuvinte(String s){

        String[] cuvinte = s.split("\\s+");
        return cuvinte.length;
    }

    public boolean stelutza(){
        double randomVal = Math.random();
        return randomVal < 0.1;
    }

}


