package aron.week07.gitarrist;

public class AkustikGitarre {

        private String marke;
        private String korpus;
        private int seiten;
        private String typ;

        public AkustikGitarre (String marke,String korpus, int seiten, String typ){

            this.marke = marke;
            this.korpus = korpus;
            this.seiten = seiten;
            this.typ = typ;
        }

    @Override

    public String toString() {return "AkustikGitarre{" + "marke='" + marke + '\'' + ", korpus='" + korpus + '\'' + ", seiten=" + seiten + ", typ='" + typ + '\'' + '}';}

    public int seiten(){return seiten;}
}

