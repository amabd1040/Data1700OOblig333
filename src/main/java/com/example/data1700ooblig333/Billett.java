package com.example.data1700ooblig333;

public class Billett {
        private String antall;
        private String fornavn;
        private String etternavn;
        private String mobilnummer;
        private String epost;
        private String film;

        public Billett (String antall, String fornavn, String etternavn, String mobilnummer,String epost, String film){
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.mobilnummer = mobilnummer;
            this.epost = epost;
            this.film = film;
        }
        public Billett(){}
        public String getAntall() {return antall;}
        public void setAntall (String antall) {this.antall = antall;}
        public String getFornavn() {return fornavn;}
        public void setFornavn (String fornavn) {this.fornavn = fornavn;}
        public String getEtternavn () {return etternavn;}
        public void setEtternavn (String etternavn) {this.etternavn = etternavn;}
        public String getMobilnummer () {return mobilnummer;}
        public void setMobilnummer (String mobilnummer) {this.mobilnummer = mobilnummer;}
        public String getEpost () {return epost;}
        public void setEpost (String epost) {this.epost = epost;}
        public String getFilm () {return film;}
        public void setFilm (String navn) {this.film = navn;}
    }



