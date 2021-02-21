package com.company;

public class Main {
    static int nrObiecte;

    public static void main(String[] args) {
	// write your code here
    }
    public class Acvariu{
        String formaAcvariu;
        double pretAcvariu;
        double dimLungime, dimLatime, dimInaltime; // in cm (centimetri)
        double volumAcvariu;        // in Grame: sa se calculeze in dependenta de dimensiunea acvariului

        int nrVietAcvariu;
        int [] tipVietuitoare;      // 2-pradator; 1-inofensivi; 0-vegetatie;

        public void Acvariu(){
            formaAcvariu    = "Dreptunghi";
            pretAcvariu     = 500;
            dimLungime      = 25;
            dimLatime       = 15;
            dimInaltime     = 20;
            volumAcvariu    = calcVolumAcvariu(dimLungime, dimLatime, dimInaltime);
            nrVietAcvariu   = 5;
            tipVietuitoare = new int[nrVietAcvariu];
            for (int i:tipVietuitoare) {
                tipVietuitoare[i] = i < nrVietAcvariu / 1.5 ? 1 : 0;
            }
        }
        public void Acvariu(String formaAcvariu, double pretAcvariu, double dimLungime, double dimLatime, double dimInaltime, int nrVietAcvariu, int[] tipVietuitoare){
            this.formaAcvariu   = formaAcvariu;
            this.pretAcvariu    = pretAcvariu;
            this.dimLungime     = dimLungime;
            this.dimLatime      = dimLatime;
            this.dimInaltime    = dimInaltime;
            volumAcvariu = calcVolumAcvariu(this.dimLungime, this.dimLatime, this.dimInaltime);
            this.nrVietAcvariu  = nrVietAcvariu;

            for (int i=0;i<nrVietAcvariu;i++){
                this.tipVietuitoare[i] = tipVietuitoare[i] >= 0 && tipVietuitoare[i] <= 3 ? tipVietuitoare[i] : 3;
            }
        }

        public void Acvariu(Acvariu acvariu){
            this.formaAcvariu   = acvariu.formaAcvariu;
            this.pretAcvariu    = acvariu.pretAcvariu;
            this.dimLungime     = acvariu.dimLungime;
            this.dimLatime      = acvariu.dimLatime;
            this.dimInaltime    = acvariu.dimInaltime;

            if (acvariu.volumAcvariu > 0)
                this.volumAcvariu   = acvariu.volumAcvariu;
            else if (this.dimLungime    > 0 &&
                     this.dimLatime     > 0 &&
                     this.dimInaltime   > 0)
                this.volumAcvariu   = calcVolumAcvariu(acvariu.dimLungime, acvariu.dimLatime, acvariu.dimInaltime);

            this.nrVietAcvariu  = acvariu.nrVietAcvariu;

            for (int i:acvariu.tipVietuitoare) {
                this.tipVietuitoare[i] = acvariu.tipVietuitoare[i];
            }
        }

        private void setPretAcvariu(double pretAcvariu){
            this.pretAcvariu = pretAcvariu;
        }

        private double calcVolumAcvariu(double lungime, double latime, double inaltime){
            return (lungime * latime * inaltime);
        }
    }
}
