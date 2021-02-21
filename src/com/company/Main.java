package com.company;

public class Main {
    static int nrObiecte;

    public static void main(String[] args) {
	// write your code here
    }
    public class Acvariu{
        String formaAcvariu;
        double pretAcvariu;
        double dimLungime, dimLatime, dimInaltime;
        double volumAcvariu;        //sa se calculeze in dependenta de dimensiunea acvariului

        int nrVietuitoareAcvariu;
        int [] tipVietuitoare;      // 2-pradator; 1-inofensivi; 0-vegetatie;

        public void Acvariu(){
            System.out.println("Constructor fara parametri!");
        }

        private void setPretAcvariu(double pretAcvariu){
            this.pretAcvariu = pretAcvariu;
        }
    }
}
